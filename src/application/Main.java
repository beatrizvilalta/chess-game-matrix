package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines: ");
        int lines = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();

        int[][] mat = new int[lines][columns];
        int i, j;
        for(i = 0; i < mat.length; i++){
            for(j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number you want to find: ");
        int typedNumber = sc.nextInt();
        for(i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                if(typedNumber == mat[i][j]){
                    System.out.println("Position [" + i + ", " + j + "]: ");
                    if (shouldPrintLine(j-1, mat[i].length)){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (shouldPrintLine(j+1, mat[i].length)){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (shouldPrintLine(i-1, mat.length)){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if(shouldPrintLine(i+1, mat.length)){
                        System.out.println("Down: " + mat[i +1][j]);
                    }
                }
            }
        }
    }

    public static boolean shouldPrintLine(int position, int length){
        if ((position < 0)||(position > (length-1))){
            return false;
        } else{
            return true;
        }
    }
}
