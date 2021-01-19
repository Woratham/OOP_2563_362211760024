package LAB7;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class Student {
    //class attrbutes
    static String faculty = "MT RUTS";
    String name;
    int age;
    String major;

    //behavior
    public void introduce(){
        System.out.println("My name is"+name);
        System.out.println("I am"+age+"years old.");
        System.out.println("I studying in"+major);
        System.out.println("Faculty:"+faculty);

    }
    public void changeFaculty(String newfac){
        faculty = newfac;
    }

}
