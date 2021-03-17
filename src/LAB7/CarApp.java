package LAB7;

<<<<<<< HEAD
=======

>>>>>>> origin/master
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
<<<<<<< HEAD
=======

>>>>>>> origin/master
    public static void main(String[] args) {
        //create object
        Car c1 = new Car();

<<<<<<< HEAD

=======
>>>>>>> origin/master
        Car c2 = new Car("AB123","Black","Honda");

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c1 = inputDataObject(c1);
        System.out.println(c1.toString());

        //store object in ArrayList
        ArrayList<Car> myCar = new ArrayList<Car>();
        myCar.add(c1);
        myCar.add(c2);

        System.out.println(myCar.get(0));
<<<<<<< HEAD


    }

    private static Car inputDataObject(Car c) {
        Scanner sc = new Scanner(System.in);

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
    }

    private static Car inputDataObject(Car c1) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car id: ");
        String id = sc.nextLine();
        c1.setId(id);

        System.out.print("Enter car color: ");
        c1.setColor(sc.nextLine());

        System.out.print("Enter car brand: ");
        c1.setBrand(sc.nextLine());

        return c1;
    }
}
>>>>>>> origin/master
