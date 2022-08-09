package RefrigeratorJava;

public class Refrigerator extends Appliance implements IRefrigerator {
    
    private String color;
    
    public String getColor() {
        return color;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }

    private String brand;
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String weight;
    
    private boolean has_touchscreen;
    
    private int num_of_doors;
    
    private int num_of_lights;
    
    private int num_of_drawers;
    
    private int has_icemachine;
    
    private Boolean has_food;

    public Boolean getHas_food() {
        return has_food;
    }
    public void setHas_food(Boolean newHas_food) {
        this.has_food = newHas_food;
    }

    public Refrigerator(String Color, String Brand, String Weight, Boolean Has_touchscreen, int Num_of_drawers, int Has_icemachine) {
        this.color = Color;
        this.brand = Brand;
        this.weight = Weight;
        this.has_touchscreen = Has_touchscreen;
        this.num_of_drawers = Num_of_drawers;
        this.has_icemachine = Has_icemachine;
    }
    
    public void PowerOn() {
        System.out.println("Powered On");
    }
    
    public Boolean FoodIsCold() {
        if ((this.has_food)) {
            return true;
        }
        else {
            return false;
        }
    }
}
