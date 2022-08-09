import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite dlinu massiva: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Vvedite elementy massiva:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Elementy massiva:");
        System.out.println(Arrays.toString(array));
        int c = getCountEvenNumbers (array);
        System.out.println("Kolichestvo chetnyh chisel v massiva: "+ c);
    }

    /*public class FirstArrayTask {*/
    public static int getCountEvenNumbers(int [] array) {
        int evens = 0;
        for (int value : array) {
            if (value % 2 == 0)
                evens++;
        }
        return evens;
    }
        /*
     * Данный метод должен возвращать количество четных чисел в массиве, массив передается в параметрах метода
     * четные числа - это те числа, которые делятся на 2 без остатка
     * @param array массив чисел
     * @return количество четных чисел в массиве
     */
}
