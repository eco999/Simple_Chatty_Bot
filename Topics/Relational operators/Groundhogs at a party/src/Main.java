import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        if(numCups >= 10 && numCups <= 20 && !weekend)
        {
            System.out.println(true);
        }
        else if(numCups >= 15 && numCups <= 25 && weekend)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}