import java.util.Scanner;

public class T1Poin1 {
    public static void main(String[] args) {
        String[] nama = new String[5];

        Scanner input = new Scanner(System.in);

        int ke = 1;
        for (int k = 0; k < nama.length; k++){
            System.out.print("Masukan Nama ke -" + ke + ": ");
            nama[k] = input.nextLine();
            ke++;
        }

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("==                   Daftar Nama                    ==");
        System.out.println("------------------------------------------------------");
        System.out.println();

        int index = 1;
        for (int i = 0; i < nama.length; i++){
            System.out.println("nama ke-"+ index + " " + nama[i]);
            index++;
        }
    }
}
