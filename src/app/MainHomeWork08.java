package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainHomeWork08 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[15];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(100)+1;
        }
        System.out.println("Початковий вигляд масиву: " + Arrays.toString(array));
        for (int i = 0; i < array.length ; i++) {
            int element = array[i];
            int j = i;
            while ( j > 0 && array[j-1] > element){
               array[j] = array[j-1];
               j = j-1;
               array[j] = element;
            }
        }
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int inputnumber = sc.nextInt();
        int key = Arrays.binarySearch(array,inputnumber);
        if (key < 0){
            System.out.println("числа немає");
        } else System.out.print("Індекс числа " + inputnumber + " у відсортованому масиві: " + key);
    }
}
