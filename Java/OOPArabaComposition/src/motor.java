
public class motor {

    private boolean motorDurumu = false;
    
    public void motorAc()
    {
        if (motorDurumu == true)
        {
            System.out.println("Motor Zaten Calisir Durumda.");
        }
        else
        {
            System.out.println("Motor Calistiriliyor.");
            motorDurumu = true;
        }
    }
    
    public void motorKapat()
    {
        if (motorDurumu == false)
        {
            System.out.println("Motor Zaten Kapali Durumda.");
        }
        else
        {
            System.out.println("Motor Kapatiliyor.");
            motorDurumu = false;
        }
    }

    public motor() {
    }

    public boolean isMotorDurumu() {
        return motorDurumu;
    }

    public void setMotorDurumu(boolean motorDurumu) {
        this.motorDurumu = motorDurumu;
    }
    
    
}
