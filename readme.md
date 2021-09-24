https://gitlab.com/dan-it/groups/fs15/-/tree/master/java-basic/homework/homework2

Массивы

Задание
Написать программу "стрельба по площади".

Технические требования:

Дан квадрат 5х5, где программа случайным образом ставит цель.
Перед началом игры на экран выводится текст: All set. Get ready to rumble!.
Сам процесс игры обрабатывается в бесконечном цикле.
Игроку предлагается ввести линию для стрельбы; программа проверяет что бьло введено число, и введенная линия находится в границах игрового поля (1-5). В случае, если игрок ошибся предлагает ввести число еще раз.
Игроку предлагается ввести столбик для стрельбы (должен проходить аналогичную проверку).
После каждого выстрела необходимо отображать обновленное игровое поле в консоли. Клетки, куда игрок уже стрелял, необходимо отметить как *.
Игра заканчивается при поражении цели. В конце игры вывести в консоль фразу You have won!, а также игровое поле. Пораженную цель отметить как x.
Задание должно быть выполнено ипспользуя массивы (НЕ используйте интерфейсы List, Set, Map).

Пример вывода в консоль:
 0 | 1 | 2 | 3 | 4 | 5 |
 1 | - | - | - | - | - |
 2 | - | * | * | - | - |
 3 | * | - | - | * | - |
 4 | - | - | - | - | * |
 5 | * | - | * | - | - |

Необязательное задание продвинутой сложности:

Доработайте "стрельбу по площади" так, чтобы "цель" занимала 3 клетки (по горизонтали или вертикали), а пораженные отсеки отмечались x.


Литература:
Многомерные массивы
http://study-java.ru/uroki-java/urok-12-mnogomerny-e-massivy-v-java/
