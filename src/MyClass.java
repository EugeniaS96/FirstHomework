import  java.util.Scanner;
public class MyClass {


    public static void main(String[] params) {

        System.out.println("Введите возраст вашего друга: ");
        Scanner in = new Scanner(System.in);
        String age = in.nextLine();
        System.out.println("Введите имя вашего друга: ");
        String name = in.nextLine();
        System.out.println("Моему другу " + name + " на данный момент " + age + " лет");


    }
}
