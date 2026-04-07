package Array2D;

import java.util.Scanner;

public class TwoDSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of the 2D matrix:");
        int rows = sc.nextInt();
        System.out.print("Etner the number of columns of the 2D matrix:");
        int columns = sc.nextInt();
        int[][] array1 = new int[rows][columns];
        int[][] array2 = new int[rows][columns];
        System.out.println("<=====Enter the elements of the first array=====>");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the element at array1{" + i + "}{" + j + "}:");
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("<=====Enter the elements of the second array=====>");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the element at array2{" + i + "}{" + j + "}:");
                array2[i][j] = sc.nextInt();
            }
        }
        char option;
        while(true) {
            System.out.println("You have two options\n1.Matrix1-Matrix2\n2.Matrix2-Matrix1");
            System.out.print("Enter the serial number of your desired option");
            option = sc.next().charAt(0);
            if(option=='1' || option=='2'){
                break;
            }
            else{
                System.out.println("**Enter a valid option**");
            }
        }
        switch (option) {
            case '1':
                System.out.print("The matrix after the Matrix1-Matrix2 is:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(array1[i][j] - array2[i][j] + " ");
                    }
                }
                break;
            case '2':
                System.out.print("The matrix after the subtraction of Matrix2-Matrix1 is:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(array2[i][j] - array1[i][j] + " ");
                    }
                }
            break;
        }
    }
}
