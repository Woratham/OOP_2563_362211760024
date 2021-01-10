package LAB3;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class ex_for2 {

    public static void main(String[] args) {

        //รับค่าจำนวนเต็มจากผู้ใช่ 5 จำนวน
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i <5 ; i++) { //0-4
            System.out.println("Enter intgers: ");
            int num = sc.nextInt();
            total += num; //total = total + num;
            System.out.println("entered :"+ num);

        }
        System.out.println("total bye");
        System.out.println("Good bye");
        System.out.println("Good bye");







    }

}
