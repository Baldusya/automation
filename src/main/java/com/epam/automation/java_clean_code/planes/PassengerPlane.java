package com.epam.automation.java_clean_code.planes;

public class PassengerPlane extends Plane{

    private final int passengersCapacity;

    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public int GetMaxFlightDistance() {
        return super.GetMaxFlightDistance();
    }

    @Override
    public int getMinLoadCapacity() {
        return super.getMinLoadCapacity();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassengerPlane that = (PassengerPlane) o;

        return passengersCapacity == that.passengersCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + passengersCapacity;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PassengerPlane{");
        sb.append("passengersCapacity=").append(passengersCapacity);
        sb.append('}');
        return sb.toString();
    }
}
