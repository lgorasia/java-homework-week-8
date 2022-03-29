package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting values of variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);
        // display value of the variabless
        System.out.println("Prime's name:" + obj.getName());
        System.out.println("prime's age:" + obj.getAge());
        System.out.println("Prime's rollNo:" + obj.getRollNo());
    }
}
