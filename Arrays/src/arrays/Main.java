package arrays;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	int array[] = {3,5,6,90,24};// масив з певним числом елементів
	Arrays.sort(array);// метод сортування масиву від найменшого до найбільшого значеннф
		 System.out.println(Arrays.toString(array));//виведення всіх елементів масиву в стрічку
		 System.out.println(array[array.length -1]);// виведення останнього елементу масмву
}
} 
