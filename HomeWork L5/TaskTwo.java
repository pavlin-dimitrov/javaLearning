import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();

        if ( points >= 1 && points <= 3){
            points *= 10;
        } else if ( points >= 4 && points <= 6){
            points *= 100;
        } else if ( points >= 7 && points <= 9){
            points *= 1000;
        } else {
            System.out.println("Error: out of range!");
        }
        System.out.println(points);
    }
}
