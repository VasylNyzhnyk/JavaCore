package TicTacToe;

class Field {

    static char[] arr = new char[9];
    static char USER_SYMBOL = 'o';
    static char PC_SYMBOL = 'x';

    static void show() {

        System.out.println(" " + arr[0] + " | " + arr[1] + " | " + arr[2] + "  ");
        System.out.println("--- --- ---");
        System.out.println(" " + arr[3] + " | " + arr[4] + " | " + arr[5] + "  ");
        System.out.println("--- --- ---");
        System.out.println(" " + arr[6] + " | " + arr[7] + " | " + arr[8] + "  ");
    }


}

