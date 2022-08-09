package Tablets;
public class IPadAir extends Tablets {
    
    private boolean is_person_is_in_the_bathroom;
    
    private boolean has_home_button;
    
    public IPadAir(
        String color, 
        String brand,
        Double screen_area,
        Double thickness,
        Double weight, 
        int storage,
        Boolean cellular,
        Boolean wifi,
        Boolean is_person_is_in_the_bathroom,
        Boolean has_home_button) 
        {
        super();
        
        this.is_person_is_in_the_bathroom = this.is_person_is_in_the_bathroom;
        this.has_home_button = this.has_home_button;
    }
    
    public final boolean CanUnlock() {
        return true;
    }
    
    protected final void StartFaceTime() {
        if (this.is_person_is_in_the_bathroom) {
            System.out.println("Yo just text like a normal person");
        }
        else {
            System.out.println("Ok let\'s video chat");
        }
        
    }
    
    protected final void GetNewIpad() {
        if (this.has_home_button) {
            System.out.println("It\'s time for an upgrade!");
        }
        else {
            System.out.println("Wow you must be rich!");
        }
        
    }
}

 
