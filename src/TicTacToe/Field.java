package TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Field {

    static char[] arr = new char[9];

     static void getUserMessage() {
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("--- --- ---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("--- --- ---");
        System.out.println(" 7 | 8 | 9 ");

    }
   /* static void setStep(){


    }*/

    static void show() {

            System.out.println(" " + arr[0] + " | " + arr[1] + " | " + arr[2] + "  ");
            System.out.println("--- --- ---");
            System.out.println(" " + arr[3] + " | " + arr[4] + " | " + arr[5] + "  ");
            System.out.println("--- --- ---");
            System.out.println(" " + arr[6] + " | " + arr[7] + " | " + arr[8] + "  ");
            }


        }

