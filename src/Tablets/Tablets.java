package Tablets;
public class Tablets implements ITablets {


    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    private String brand;
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private Double screen_area;
    
    public Double getScreen_area() {
        return screen_area;
    }

    public void setScreen_area(Double screen_area) {
        this.screen_area = screen_area;
    }

    private Double thickness;
    
    public Double getThickness() {
        return thickness;
    }

    public void setThickness(Double thickness) {
        this.thickness = thickness;
    }
    private Double weight;
    
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    private int storage;
    
    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
    private Boolean cellular;
    
    public Boolean getCellular() {
        return cellular;
    }

    public void setCellular(Boolean cellular) {
        this.cellular = cellular;
    }
    
    private Boolean wifi;
    
    
    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }



    // Methods
    public final void InternetAccess() {
        if ((wifi == true)) {
            System.out.println("You are connected to the Internet!");
        }
        else {
            System.out.println("You are not connected to the Internet!");
        }
        
    }
    
    public final void CellularAccess() {
        if ((cellular == true)) {
            System.out.println("You are connected to the Internet!");
        }
        else {
            System.out.println("You are not connected to the Internet!");
        }
        
    }
    
    public final void PlayGames() {
        if ((screen_area > 10)) {
            System.out.println("You can play any game!");
        }
        
        if ((screen_area <= 10)) {
            System.out.println("You can only play flappy bird :(");
        }
        else {
            System.out.println("Booooooooo");
        }
        
    }
    
    public final void Message() {
        if ((cellular == true)) {
            System.out.println("You can send text messages!");
        }
        else {
            System.out.println("You cannot send text messages");
        }
        
    }
}
