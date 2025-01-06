package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;
        double average;

        System.out.println("5개의 정수를 입력하세요:");
        // 5개의 정수 입력 받아서 배열에 저장
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        average = (double) total / numbers.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.print("입력한 정수의 평균: " + average);
    }
}
