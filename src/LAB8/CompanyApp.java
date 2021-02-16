package LAB8;

public class CompanyApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setPid("1809900879628");
        emp1.setName("Suphaset");
        emp1.setAge(23);
        emp1.setGender("Male");
        emp1.setTel("09525xxxxx");

        emp1.setEmpID("emp001");
        emp1.setPosition("Programmer");
        emp1.setSalary(12000.00);

        System.out.println(emp1.toString());

    }
}