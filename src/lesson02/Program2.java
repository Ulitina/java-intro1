package lesson02;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        /*Person p1 = new Person("Vasya", "Pupkin", 32);
        Person p2 = new Person("Tanya", "Ivanova", 30);

        System.out.println(p1);*/

        Scanner in = new Scanner(System.in);
        System.out.print("Input text: ");

        String text = in.nextLine();

        if (text.isEmpty()) {
            System.out.println("Enter some text");
        }
        else {System.out.print("Enter a number that is less or equal to text length: ");
            int i = in.nextInt();
            if (i < 0 ||i > text.length()){
                System.out.print("Enter a number that is less or equal to text length: ");
            }
            else {
                StringTest st1 = new StringTest();
                st1.everyNth(text, i);
    }
}}}
