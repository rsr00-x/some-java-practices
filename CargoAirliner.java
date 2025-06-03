class CargoAirliner extends AirTransporter {
    private int maxCargoWeight;

    // Default Constructor
    public CargoAirliner() {
    }

    // Parameterized Constructor
    public CargoAirliner(String manufacturer, double maxAltitude, double maxSpeed, int maxCargoWeight) {
        super(manufacturer, maxAltitude, maxSpeed);
        this.maxCargoWeight = maxCargoWeight;
    }

    // Setter for maxCargoWeight
    public void setmaxCargoWeight(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    // Getter for maxCargoWeight
    public int getmaxCargoWeight() {
        return maxCargoWeight;
    }

    // Overridden Method to show details
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Max Weight Capacity : " + maxCargoWeight + " KG");
    }
}
