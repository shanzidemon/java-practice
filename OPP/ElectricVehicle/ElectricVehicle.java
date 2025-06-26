public class ElectricVehicle{
    private double batteryCapacity;
    private double currentCharge;
    private double energyConsumptionRate;
    public ElectricVehicle(){
 
    }
    public ElectricVehicle(double batteryCapacity,double currentCharge,double energyConsumptionRate){
        this.batteryCapacity=batteryCapacity;
        this.currentCharge=currentCharge;
        this.energyConsumptionRate=energyConsumptionRate;
    }
    public void setBatteryCapacity(double batteryCapacity){
        this.batteryCapacity=batteryCapacity;
    }
    public double getBatteryCapacity(){
        return batteryCapacity;
    }
    public void setCurrentCharge(double currentCharge){
        this.currentCharge=currentCharge;
    }
    public double getCurrentCharge(){
        return currentCharge;
    }
    public void setEnergyConsumptionRate(double energyConsumptionRate){
        this.energyConsumptionRate=energyConsumptionRate;
    }
    public double getEnergyConsumptionRate(){
        return energyConsumptionRate;
    }

    public double calculateRange() {
        return currentCharge/energyConsumptionRate;
    }
    public double calculateEnergyConsumption(double miles){
        return miles*energyConsumptionRate;
    }
    public double estimateChargingTime(double chargerRate){
        return (batteryCapacity-currentCharge)/chargerRate;
    }
    public double calculateCostPerMile(double electricityRate){
        return energyConsumptionRate*electricityRate;
    }
}