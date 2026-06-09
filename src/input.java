import java.sql.SQLOutput;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Width :");
        double width = sc.nextDouble();

        System.out.print("Enter Length :");
        double length = sc.nextDouble();

        double area = width * length ;

        System.out.println("The area is " +area + "cm²");
    }
}
