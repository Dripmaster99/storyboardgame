package RefrigeratorJava;

public class Appliance implements IAppliance {
    
    private boolean power_on = true;
    
    public void PowerOn() {
        if ((this.power_on == false)) {
            this.power_on = true;
            System.out.println("you have turned on this device");
        }
        else {
            System.out.println("this device is already powered on");
        }
        
    }
    
    public final void PowerOn(String message) {
        System.out.println(message);
        if ((this.power_on == false)) {
            this.power_on = true;
            System.out.println("you have turned on this device");
        }
        else {
            System.out.println("this device is already powered on");
        }
        
    }
}