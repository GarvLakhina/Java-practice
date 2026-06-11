import java.util.Scanner;

public class if_statements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age > 65){
            System.out.println("You are a Senior Citizen ");
        }
        else if(age >= 18){
            System.out.println("You are an adult ");
        }
        else if(age < 0){
            System.out.println("You are not born yet ");
        }
        else {
            System.out.println("You are a child");
        }
        sc.close();
    }
}



