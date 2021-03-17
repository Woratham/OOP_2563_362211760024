package LAB7;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

// รับค่าข้อมูลของวัตถุ Car 3 จำนวน จากผู้ใช้พร้อมทั้งแสดงข้อมูลทั้งหมดทางหน้าจอภาพ
=======

import java.util.ArrayList;
import java.util.Scanner;

// รับค่าข้อมูลของวัตถุ Car ทั้งหมด 3 จำนวน ของผู้ใช้ พร้อมทั้งแสดงข้อมูลทั้งหมดจากจอภาพ
>>>>>>> origin/master
public class CarApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
        System.out.println("How many car do you have? : ");
        int num = sc.nextInt();

        ArrayList<Car> myCar = new ArrayList<Car>();

        for (int i = 0; i < num; i++) {
            //input data to object
            System.out.println("Please enter car info "+(i+1)+":");
=======
        System.out.println("How many car do you have: ");
        int num = sc.nextInt();

        ArrayList<Car> myCar =new ArrayList<Car>();

        for (int i = 0; i < num; i++) {
            //input data to object
            System.out.println("Please, enter car info "+(i+1)+":");
>>>>>>> origin/master
            Car c = inputDataObject();
            myCar.add(c);

        }
<<<<<<< HEAD
        displayObject(myCar);

    }

    private static void displayObject(ArrayList<Car> myCar) {
        System.out.println("All object in Arraylist : ");
        for (Car c:myCar) {
            System.out.println(c.toString());

        }

=======

        displayObject(myCar);
    }

    private static void displayObject(ArrayList<Car> myCar) {
        System.out.println("All objects in ArrayList: ");
        for (Car c:myCar)
        {
            System.out.println(c.toString());
        }
>>>>>>> origin/master
    }

    private static Car inputDataObject() {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();
<<<<<<< HEAD

        System.out.print("Enter car id : ");
        String id = sc.nextLine();
        c.setId(id);

        System.out.print("Enter car color : ");
        c.setColor(sc.nextLine());

        System.out.print("Enter car brand : ");
        c.setBrand(sc.nextLine());

        return c;

    }
}//class
=======
        System.out.print("Enter car id: ");
        String id = sc.nextLine();
        c.setId(id);

        System.out.print("Enter car color: ");
        c.setColor(sc.nextLine());

        System.out.print("Enter car brand: ");
        c.setBrand(sc.nextLine());

        return c;
    }
}
>>>>>>> origin/master
