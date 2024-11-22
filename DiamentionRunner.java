import java.util.Scanner;
public class DiamentionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension in inches: ");
        int totalInches = scanner.nextInt();
        Dimension dimension = new Dimension(totalInches);
        dimension.displayResult();
        scanner.close();
    }
}
