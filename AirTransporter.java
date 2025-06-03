class AirTransporter {
    private String manufacturer;
    private double maxAltitude;
    private double maxSpeed;

    // Default Constructor
    public AirTransporter() {
    }

    // Parameterized Constructor
    public AirTransporter(String manufacturer, double maxAltitude, double maxSpeed) {
        this.manufacturer = manufacturer;
        this.maxAltitude = maxAltitude;
        this.maxSpeed = maxSpeed;
    }

    // Setter for manufacturer
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Setter for maxAltitude
    public void setMaxAltitude(double maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    // Setter for maxSpeed
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Getter for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    // Getter for maxAltitude
    public double getMaxAltitude() {
        return maxAltitude;
    }

    // Getter for maxSpeed
    public double getMaxSpeed() {
        return maxSpeed;
    }

    // Method to show details
    public void showDetails() {
        System.out.println("Air Transporter Details");
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Maximum Altitude : " + maxAltitude + " ft");
        System.out.println("Maximum Speed : " + maxSpeed + " KM/Hr");
    }
}
