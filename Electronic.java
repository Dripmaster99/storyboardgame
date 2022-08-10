public class Electronic {
    
    public Electronic() {
        
    }
    
    protected boolean can_download_apps;
    
    public final void DownloadApplications() {
        string Application = "";
        if (this.can_download_apps) {
            Console.WriteLine("Searching for updates");
            Application = Console.ReadLine();
        }
        
        if ((Application == "New software")) {
            Console.WriteLine((Application + " has been downloaded."));
        }
        else {
            Console.WriteLine((Application + " is unavailible for this device."));
        }
        
    }
    
    public final boolean Can_download_apps {
    }
}