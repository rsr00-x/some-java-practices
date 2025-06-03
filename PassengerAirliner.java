class PassengerAirliner extends AirTransporter {
    private int passengerCapacity;

    // Parameterized Constructor
    public PassengerAirliner(String manufacturer, double maxAltitude, double maxSpeed, int passengerCapacity) {
        super(manufacturer, maxAltitude, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    // Setter for passengerCapacity
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    // Getter for passengerCapacity
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    // Overridden Method to show details
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Passenger Capacity : " + passengerCapacity);
    }
}
