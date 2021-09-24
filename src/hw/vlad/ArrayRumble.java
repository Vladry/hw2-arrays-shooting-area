package hw.vlad;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArrayRumble {
    static int[] tgtXY = setTarget();
    static int xMin = 0;
    static int yMin = 0;
    static int xMax = 5;
    static int yMax = 5;
    static int[][] field = new int[xMax][yMax];
    static int[] hitXY = new int[2];


    public static void main(String[] args) {
        System.out.println("\n\n");
        System.out.println("All set. Get ready to rumble!");
//        while (true) {
        drawField();
        hitXY = getHit();
//            checkIfHit();


//        }//while
    }


    private static void drawField() {

        for (int y = yMin; y <= yMax; y++) {
            for (int x = xMin; x <= xMax; x++) {
                if (y == 0) {
                    System.out.print(x + " | ");
                } else {
                    if (x == 0) {
                        System.out.print(y + " | ");
                    } else

                        System.out.print("- | ");
                }
                if (x == xMax) {
                    System.out.println("");
                }
            }
        }

    }

    private static int[] getHit() {
        return new int[]{3, 4};
    }
    private static int[] setTarget() {
        Random ran = new Random();
        int xCoordinateTarget = ran.nextInt(6);
        int yCoordinateTarget = ran.nextInt(6);
        return new int[]{xCoordinateTarget, yCoordinateTarget};
    }


}
