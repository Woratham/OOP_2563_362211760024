package LAB3;

import java.util.Scanner;

public class ex_while {
    public static void main(String[] args) {

        // ให้รับค่าจำนวนเต็มจากผู้ใช้ไปเรื่อยๆ หากผู้ใช้ป้อนค่า้ลข 0 ให้หยุด

        Scanner sc = new Scanner(System.in);
        int num = 1;
         while (num !=0) {
             System.out.print("Enter integers");
             num = sc.nextInt();
         }
         System.out.println("Good Bye");





    }
}
