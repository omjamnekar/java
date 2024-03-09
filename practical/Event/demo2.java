import java.util.*;

class demo2 {
    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter age:");
            age = s.nextInt();
            if (age < 18) {
                System.out.println("Not eligible");
            } else {
                System.out.println("eligible");
            }
        } catch (Exception e) {
            System.out.println("Not Recognised");
        } finally {
            System.out.println("Hello");
        }
    }

}