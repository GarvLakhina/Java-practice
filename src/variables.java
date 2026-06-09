public class variables {
    public static void main(String[] args){

        int age = 18;
        double price = 19.99;
        char currency = '$';
        boolean isAdult = true;
        String name = "Wizking";
        if(isAdult) {
            System.out.println(name +" is an adult and there age is " +age);
        }
        else{
            System.out.println(name +" is not an adult and there age is " +age);
        }
        System.out.println("The cost of the car is " +currency +price);
    }
}
