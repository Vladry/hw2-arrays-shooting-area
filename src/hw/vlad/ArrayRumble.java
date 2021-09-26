package hw.vlad;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayRumble {
    static int[] tgtXY = setTarget();
    static int xMin = 0;
    static int yMin = 0;
    static int xMax = 5;
    static int yMax = 5;
    static String[][] field = new String[xMax + 2][yMax + 2];
    static int[] hitYX = new int[2];
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("All set. Get ready to rumble!\n\n");
        formFieldArray();
        while (!Arrays.equals(hitYX, tgtXY)) {

            drawField();
            hitYX = getHit();
            checkHit();

        }//while
    }

    private static void checkHit() {
        field[hitYX[0]][hitYX[1]] = "* | ";
        if (Arrays.equals(hitYX, tgtXY)) {
            System.out.println("\n\n\n You have won!");
            field[hitYX[0]][hitYX[1]] = "X | ";
            drawField();
        }
    }

    private static void formFieldArray() {

        for (int y = yMin; y <= yMax + 1; y++) {
            for (int x = xMin; x <= xMax + 1; x++) {
                if (y == 0) {
                    field[y][x] = x + " | ";
                } else {
                    if (x == 0) {
                        field[y][x] = y + " | ";
                    } else
                        field[y][x] = "- | ";
                }
                if (x == xMax + 1) {
                    field[y][x] = "\n";
                }
            }
        }
        field[tgtXY[0]][tgtXY[1]] = ". | "; //подсказка где находится цель (для режима проверки ментором)
    }

    private static void drawField() {
        for (int y = yMin; y <= yMax; y++) {
            for (int x = xMin; x <= xMax + 1; x++) {
                System.out.print(field[y][x]);
            }
        }
    }

    private static int[] getHit() {
        int[] hitCoordinates = new int[2];
        System.out.println("input the Y hit coordinate.");
        hitCoordinates[0] = getOneHitCoordinate(yMin, yMax);
        System.out.println("input the X hit coordinate.");
        hitCoordinates[1] = getOneHitCoordinate(xMin, xMax);
        return hitCoordinates;
    }

    private static int getOneHitCoordinate(int minLimit, int maxLimit) {
        System.out.print("allowed input value from 1 to 5: ");
        if (!scan.hasNextInt()) {
            return getOneHitCoordinate(minLimit, maxLimit);
        } else {
            int tempValue = scan.nextInt();
            if (tempValue <= maxLimit && tempValue > minLimit) {
                return tempValue;
            } else return getOneHitCoordinate(minLimit, maxLimit);
        }
    }

    private static int[] setTarget() {
        Random ran = new Random();
        int xCoordinateTarget = 1 + ran.nextInt(5);
        int yCoordinateTarget = 1 + ran.nextInt(5);
        return new int[]{yCoordinateTarget, xCoordinateTarget};
    }


}
