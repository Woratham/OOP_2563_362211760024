package LAB7;

public class StudentApp {
    public static void main(String[] args) {
        Student std1 = new Student(); // call constructor
        std1.introduce();
        std1.name = "Puriwat Lertkrai";
        std1.age = 34;
        std1.major = "MIT";
        std1.introduce();

        Student std2 = new Student();
        std2.name = "Piyapong Senanut";
        std2.age = 37;
        std2.major = "AC";
        std2.introduce();

        std2.major = "MIT";
        std2.introduce();

        std1.changeFaculty("Engineer RUTS");
        std1.introduce();
        std2.introduce();



    }

}
