import java.util.Scanner;
public class cart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What item do u want to buy ?: ");
        String item = sc.nextLine();
        System.out.print("What is its price ?: ");
        double price = sc.nextDouble();
        System.out.print("How many do u want to buy ?: ");
        int quantity = sc.nextInt();

        double total = price * quantity ;
        System.out.println("You have gotten "+quantity +" "+item +" for $"+total );
    }
}

