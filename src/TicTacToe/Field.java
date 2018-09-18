package TicTacToe;

 class Field {

     static char[] arr = new char[9];

     static void getUserMessage() {
        System.out.println(" 0 | 1 | 2 ");
        System.out.println("--- --- ---");
        System.out.println(" 3 | 4 | 5 ");
        System.out.println("--- --- ---");
        System.out.println(" 6 | 7 | 8 ");

    }


    static void show() {

        System.out.println(" "+arr[0]+" | "+arr[1]+" | "+arr[2]+"  ");
        System.out.println("--- --- ---");
        System.out.println(" "+arr[3]+" | "+arr[4]+" | "+arr[5]+"  ");
        System.out.println("--- --- ---");
        System.out.println(" "+arr[6]+" | "+arr[7]+" | "+arr[8]+"  ");
            }


        }

