package test;

import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //  int a =15;
        //   hallo();
        // numbers();
        //   numbersglam();
        // numbers2();
        // sumNumber2();
        // forest();
        //  stringToString();
        // multiplicationTable();
        //  stringNumber();
        //  metNum(15);
        //  returner(a);
        //   returnSquare(5);

        //  sqrt(3, 5);
        // array();
        // array1();
        array2();
    }


    static void hallo() {
        System.out.println("Привет");
        System.out.println("Введите ваше имя");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        System.out.println("Привет " + i);
    }

    static double numbers() {

        double a;
        double b;
        System.out.println("Введите первое слогаемое");
        Scanner one = new Scanner(System.in);
        a = one.nextDouble();
        System.out.println("Введите второе слогаемое");
        Scanner two = new Scanner(System.in);
        b = two.nextDouble();
        System.out.println(a + b);
        return a + b;

    }

    static double numbersglam() {

        double a;
        double b;
        double sum;

        System.out.println("Введите первое слогаемое");
        Scanner one = new Scanner(System.in);
        a = one.nextDouble();
        System.out.println("Введите второе слогаемое");
        Scanner two = new Scanner(System.in);
        b = two.nextDouble();
        sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        return sum;

    }

    static double numbers1() {

        double a;
        double b;
        double sum;

        System.out.println("Введите первое слогаемое");
        Scanner one = new Scanner(System.in);
        a = one.nextDouble();
        System.out.println("Введите второе слогаемое");
        Scanner two = new Scanner(System.in);
        b = two.nextDouble();
        if (a != 0 && b != 0) {
            sum = a + b;

            System.out.println(a + " + " + b + " = " + sum);
        } else {
            System.out.println(" ZERO Cold");
        }

        return 0;

    }


    static double numbers2() {

        double a;
        double b;
        double sum;
        do {

            System.out.println("Введите первое слогаемое");
            Scanner one = new Scanner(System.in);
            a = one.nextDouble();
            System.out.println("Введите второе слогаемое");
            Scanner two = new Scanner(System.in);
            b = two.nextDouble();

            sum = a + b;

            System.out.println(a + " + " + b + " = " + sum);

        }
        while (a != 0 && b != 0);
        return 0;
    }

    static void sumNumber() {
        double a;
        double b;
        double c;
        double result;

        System.out.println("Введите первое число");
        Scanner one = new Scanner(System.in);
        a = one.nextDouble();

        System.out.println("Введите второе число");
        Scanner two = new Scanner(System.in);
        b = two.nextDouble();

        System.out.println("Введите третье число");
        Scanner three = new Scanner(System.in);
        c = three.nextDouble();

        if (c == 1) {
            System.out.println(a + b);
        }
        if (c == 2) {

            System.out.println(a - b);
        } else {
            System.out.println("C не равно 2 или 1");
        }

    }


    //8===================================================================

    static void sumNumber2() {
        double a;
        double b;
        double c;
        double result;
        do {

            // while (c<1 || c>4 ){
            System.out.println("Введите первое число");
            Scanner one = new Scanner(System.in);
            a = one.nextDouble();

            System.out.println("Введите второе число");
            Scanner two = new Scanner(System.in);
            b = two.nextDouble();

            System.out.println("Введите третье число");
            Scanner three = new Scanner(System.in);
            c = three.nextDouble();

            if (c == 1) {
                System.out.println(a + b);
            }
            if (c == 2) {

                System.out.println(a - b);
            }
            if (c == 3) {
                System.out.println(a * b);
            }
            if (c == 4) {
                System.out.println(a / b);
            }
        }
        while (c < 1 || c > 4);
        System.out.println("C не равно 2 или 1");


    }

    //9, 10, 11================================================================

    static void forest() {

        int a;
        int b;
        for (a = 1; a <= 10; a++) {
            b = a * a;
            System.out.println(b);
        }


    }

    //12 =========================================================================


    static void stringToString() {

        int a;

        for (a = 1; a <= 10; a++) {
            for (int i = 0; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }

    //13 ============================================================================
    static void multiplicationTable() {

        int a;

        for (a = 1; a <= 10; a++) {

            for (int i = 1; i <= 10; i++) {
                int c = a * i;
                System.out.printf("%4d", c);
            }
            System.out.println();

        }


    }

    //14 ============================================================================
    static void stringNumber() {
        int a;

        int i = 1;

        for (i = 1; i <= 100; i++) {
            System.out.printf("%4d", i); //форматирование текста
            if (i % 10 == 0) {
                System.out.println();
            }
        }


    }

    //16================================================================================
    static void metNum(int a) {

        System.out.println("Мне передали число " + a);

    }


    //17==================================================================================

    static int returner(int a) {
        a = 1;
        System.out.println(a);
        return a;


    }

    //18=====================================================================================
    static int returnSquare(int a) {
        int b = a * a;
        System.out.println(b);
        return b;
    }

    //19 ======================================================================================
    static double squareSqrt(double a) {

        double b = a * a;
        return b;
    }

    static double sqrt(double c, double d) {
        c = 3;
        d = 5;
        double e = squareSqrt(c) + squareSqrt(d);
        System.out.println(e);
        System.out.println(Math.sqrt(e));
        return Math.sqrt(e);
    }

//20====================================================================

    static void array() {

        int[] a = new int[5];
        System.out.println("Введите элемент массива: ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Введенные элементы: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    //21=======================================================================
    static void array1() {

        int[] a = new int[5];
        System.out.println("Введите элемент массива: ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Введенные элементы: ");
        for (int i = a.length - 1; i >= 0; i--) {          // выводим элементы массива в обратном порядке;
            System.out.print(" " + a[i]);
        }
    }

    //22============================================================================
    static void array2() {

        int[] a = new int[5];
        System.out.println("Введите элемент массива: ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Введенные элементы: ");
        for (int i =0; i < a.length; i++) {
            if(a[i]==0) {
                System.out.print(" " + i);
            }
        }
    }
    //23============================================================================

}



/*
Уровень 0:

++1) Программа пришущая "Привет"
++2) Программа вводящая имя (скажем "Вася") и пишущая "Привет Вася" имя вводить в переменную строкового типа
++3) Программа вводящая два числа и выводящая их сумму
++4) Программа делающая то же самое, но печатающая красиво введенные числа, знаки сложения и равенства и сумму (типа "2+3=5")
++5) Программа также вводящая числа и печатающая сумму, но делающаяя это в цикле, до тех пор, пока не введут в качестве чисел два нуля
++6) Программа, вводящая три числа и выводящая сумму двух первых, если третье равно 1 или разность двух первых если третье равно 2
++7) Такую же программу, которая может еще считать умножение и деление, если третье число будет 3 или 4
8 ) Такую же программу, которая работает в цикле, пока третье число не окажется каким-нибудь неподходящим (меньше 1 или больше 4)
++9) Программа, печатающая в цикле числа от 1 до 10 (с использованием for) в одну строчку
++10) Программа, печатающая то же самое, но в столбик
++11) Программа, печатающая в цикле квадраты чисел от 1 до 10
++12) Программа, печатающая десять строчек - и в каждой числа от 1 до 10. Использовать два вложенных цикла for
++13) Программа, печатающая подобным же образом таблицу умножения (десять строчек по десять чисел в каждой).
++14) Программа, печатающая десять строчек - в первой от 1 до 10, во второй от 11 до 20 и так до десятой, в которой от 91 до 100
++15) Программа, в которой есть одна процедура, в которой печатается "Привет" - эта процедура должна вызваться из главной программы.
++16) Программа с процедурой, в которую передается в качестве параметра одно число и которая печатает "Мне передали число такое-то". Вызываться эта процедура, понятно, должна с каким-нибудь числом.
++17) Программа с одной функцией, которая ничего не делает а только возвращает число 1. Программа должна печатать значение, возвращенное функцией на экран.
++18 ) Программа с функцией, которая получает в качестве параметра число, а возвращает его квадрат.
++19) Программа в которой будет две функции. Одна для нахождения квадрата числа, которое ей передали в качестве параметра, а вторая чтобы получала два числа и возвращала квадратный корень из суммы их квадратов. Для возведения чисел в квадрат она должна использовать первую функцию, для вычисления квадратного корня - найти стандартную функцию.
++20) Программа, у которой есть массив из пяти чисел. В массив надо ввести пять чисел с клавиатуры (использовать for для прохода по массиву) а потом распечатать эти введенные в массив числа (опять с циклом for).
++21) То же самое, но печатать числа в обратном порядке.
++22) Ввести в массив пять чисел и потом найти среди них 0, если он есть. Напечатать его номер в массиве.
23) Ввести пять чисел в массив, потом ввести еще одно число (в дополнительную переменную) и вывести номера всех элементов массива, которые больше этого числа.
24) Ввести пять чисел в массив и найти самое большое среди них.

Уровень 1:

25) (посвящается всем занудливым преподам по программированию) Ввести два числа в переменные A и B и поменять их местами с использованием дополнительной переменной, а потом без нее.
26) Ввести в массив пяти чисел, потом ввести номер k и поменять местами в массиве k-й элемент с последним.
27) Найти в массиве пяти чисел самый большой элемент и поменять его с последним.
28 ) Найти в массиве пяти чисел самый большой элемент, поменять с последним, потом повторить ту же процедуру для оставшихся четырех (т.е. с 1-го по 4-й), дальше для оставшихся трех и т.п. Использовать два цикла, один вложенный в другой. Это называется сортировка выбором. Оценить зависимость времени работы от количества элементов массива.
29) Ввести массив N чисел и далее пройти в цикле со 1-го по N-1 элементы для каждого проверяя, если он больше следующего (то есть k-й больше чем k+1-й), то переставлять их друг с другом местами. Какой элемент в результате этой операции окажется на последнем месте?
30) Похоже на задачу 28. Выполнить процедуру из задачи 29 сначала для всего массива, потом для первых N-1 элемента, потом для первых N-2 элементов и так далее. Это называется сортировка "пузырьком" потому что самый большой элемент всплывает как пузырек. Оценить зависимость времени от количества элементов массива. Придумать и написать программу, которая заполняла бы массив случайными числами и сортировала его одной и другой сортировкой чтобы узнать, какая сортировка работает быстрее. (возможно, заполнять и сортировать придется раз сто и довольно большой массив, чтоб удалось засечь приемлемое время).

Уровень 2:

31) Прочесть про рекурсию, реализовать процедуру, которая вводит число с клавиатуры в локальную переменную, если ввели не 0, то вызывает себя же, а после этого печатает введённое число. Объяснить результат работы.
32) Почитать про "быструю обменную сортировку" (quicksort), реализовать её с помощью рекурсивной процедуры, сравнить время выполнения с задачами 28, 30.
33) Почитать про динамические структуры данных, реализовать простой однонаправленный список. (придумать простую программу для демонстрации его работы)
34) Реализовать сортировку списка (слияниями), для чего почитать википедию.
35) Реализовать структуру "двоичное дерево", написать программу добавления узлов (содержащих числа или имена) в него, а потом вывода их в сортированном порядке.
36) Реализовать "взвешенное дерево" (heap), с его помощью написать сортировку HeapSort.

P.S. Не обязательно и не очень принципиально, но в задачах поиска и сортировки рекомендовал бы в качестве доп.задания использовать не просто числа, а, например, структуры/классы состоящие из пары число-строка - ну, например, имя и возраст или что-нибудь такое - и сортировать по одному или по обоим полям, если это уместно.
 */