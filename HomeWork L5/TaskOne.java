import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumberN = scanner.nextInt();

        int nDiff = inputNumberN - 21;

        if(nDiff < 0){
            nDiff *= (-1);
            System.out.println(nDiff);
        } else if (nDiff > 21){
            nDiff *= 2;
            System.out.println(nDiff);
        } else {
            System.out.println(nDiff);
        }
    }
}
