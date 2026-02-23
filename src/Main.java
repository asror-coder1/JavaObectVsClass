//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Classga misol

        Car car = new Car();
        car.name = "Gentra";
        car.year = 14;
        car.model = "Chevrolet";


        car.IshgaTushirish();
        System.out.println("\n");
        car.boshlanishNuqta();


//        Student

        System.out.println("\n");

        Student student = new Student();
        student.firstname = "Ismoil";
        student.lastname = "Alisherov";
        student.useranme = "iska";
        student.age = 14;

        student.studentHaqida();
        student.studentInfo();


    }
}