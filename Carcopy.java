public class Carcopy {

    private String Brand;
    private int Year;
    private int NbWheels;
    private String TypeFuel;
    private boolean EngineOn;
    private boolean ContactKey;
    private boolean AcceleratorOn;
    private boolean BrakeOn;

    public Carcopy() {

    }

    public Carcopy(String Brand, int Year, int NbWheels, String TypeFuel, boolean EngineOn, boolean ContactKey, boolean AcceleratorOn, boolean BrakeOn) {

        this.Brand = Brand;
        this.Year = Year;
        this.NbWheels = NbWheels;
        this.TypeFuel = TypeFuel;
        this.EngineOn = EngineOn;
        this.ContactKey = ContactKey;
        this.AcceleratorOn = AcceleratorOn;
        this.BrakeOn = BrakeOn;
    }

    public Carcopy(Carcopy Car1) {

    }

    public void start() {

        if (ContactKey == true) {
            if (EngineOn == false) {
                 this.EngineOn = true;
            System.out.println("La voiture est maintenant démarrée");
            } else {
            System.out.println("La voiture est déjà démarrée");
            }
        } else {
            System.out.println("Il n'y a pas le contact");
        }
    }

    public void stop() {

        ContactKey = false;
    
        if (EngineOn == true) {

             EngineOn = false;
             
        System.out.println("La voiture a été arrêtée");

        } else {
        System.out.println("La voiture a déjà été arrêtée ");
        }

    }

    public void MoveForward() {

        AcceleratorOn = true;
        
                if (ContactKey == true && EngineOn == true && BrakeOn == false){
    
                    System.out.println("La voiture avance");
                    
                    }else{
                    
                        System.out.println("La voiture ne peut pas avancer, veuillez la démarrer");

                    }

    }

    public void SlowDown() {

        BrakeOn = true;
            
                    if (ContactKey == true && EngineOn == true && AcceleratorOn == false){
        
                        System.out.println("La voiture ralentit");
                        
                        }else{
                        
                            System.out.println("La voiture ne peut pas freiner ni ralentir, veuillez la démarrer et faire avancer");
    
                        }

    }

}
