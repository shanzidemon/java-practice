public class Start{
    public static void main(String[]args){
        ElectricVehicle e1=new ElectricVehicle(100,45,0.30);
        
        System.out.println("Maximum rate "+e1.calculateRange());
        System.out.println("Energy Consumption "+e1.calculateEnergyConsumption(10));
        System.out.println("Charging time "+e1.estimateChargingTime(10));
        System.out.println("Cost per Mile "+e1.calculateCostPerMile(20));
    }
} 