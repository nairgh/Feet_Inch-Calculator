import java.util.Scanner;
class Dimension {
    private int totalInches;
    private int feet;
    private int inches;

    // Constructor
    public Dimension(int totalInches) {
        this.totalInches = totalInches;
        convertToFeetAndInches();
    }
    private void convertToFeetAndInches() {
        this.feet = totalInches / 12; // Convert to feet
        this.inches = totalInches % 12; // Calculate remaining inches
    }
    public int getFeet() {
        return feet;
    }
    public int getInches() {
        return inches;
    }
    public void displayResult() {
        System.out.println(totalInches + " inches is equivalent to " + feet + " feet and " + inches + " inches.");
    }
}

