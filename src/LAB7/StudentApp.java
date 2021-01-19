package LAB7;

public class StudentApp {
    public static void main(String[] args) {

        Student STD1 = new Student();

        STD1.introduce();
        STD1.name="Woratham Kitkha";
        STD1.age=22;
        STD1.major="MIT";
        STD1.introduce();

        STD1.introduce();

        Student STD2 =new Student();
        STD2.name= "Piyapong Senanut";
        STD2.age= 37;
        STD2.major= "AC";
        STD2.introduce();

        STD2.major="MIT";
        STD2.introduce();;

        STD1.changeFaculty("Engineer RUTS");
        STD1.introduce();
        STD2.introduce();

    }
}
