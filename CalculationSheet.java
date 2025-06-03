public class CalculationSheet {

    // Fields for encapsulation
    private String sheetName;
    private double[] values;
    private int valueCount; // Tracks the number of stored values

    // Constructor to initialize the CalculationSheet
    public CalculationSheet(String sheetName, int maxValues) {
        this.sheetName = sheetName;
        this.values = new double[maxValues];
        this.valueCount = 0;
    }

    // Getter for sheetName (encapsulation)
    public String getSheetName() {
        return sheetName;
    }

    // Setter for sheetName (encapsulation)
    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    // Method to perform calculations
    public void performCalculations() {
        if (valueCount == 0) {
            System.out.println("No values to calculate.");
            return;
        }

        double sum = 0;
        for (int i = 0; i < valueCount; i++) {
            sum += values[i];
        }

        double average = sum / valueCount;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    // Method to clear the sheet
    public void clearSheet() {
        valueCount = 0; // Simply reset the counter
        System.out.println("Sheet cleared.");
    }

    // Method to add a value to the sheet
    public void addValue(double value) {
        if (valueCount < values.length) {
            values[valueCount++] = value;
            System.out.println("Value added: " + value);
        } else {
            System.out.println("Sheet is full. Cannot add more values.");
        }
    }

    // Method to display all values
    public void displayValues() {
        if (valueCount == 0) {
            System.out.println("No values to display.");
            return;
        }

        System.out.print("Values in the sheet: ");
        for (int i = 0; i < valueCount; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    // Static main method to demonstrate the usage
    public static void main(String[] args) {
        CalculationSheet sheet = new CalculationSheet("MySheet", 5); // Maximum 5 values

        // Adding values
        sheet.addValue(10.5);
        sheet.addValue(20.0);
        sheet.addValue(30.0);

        // Displaying values
        sheet.displayValues();

        // Performing calculations
        sheet.performCalculations();

        // Adding more values
        sheet.addValue(40.0);
        sheet.addValue(50.0);
        sheet.addValue(60.0); // This will exceed the limit

        // Displaying values
        sheet.displayValues();

        // Clearing the sheet
        sheet.clearSheet();
        sheet.displayValues();
    }
}
