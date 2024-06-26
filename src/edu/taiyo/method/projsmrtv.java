package edu.taiyo.method;

public class projsmrtv {
    boolean on = false;
    int channel = 10;
    int vol = 25; 

    public void ChangeChannel(int newChannel){
        channel = newChannel;
    }

    public void RaiseChannel(){
        channel++;
    }
    public void LowerChannel(){
        channel--;
    }
    public void RaiseVol(){
        //vol = vol + 1;
        vol++;
        System.out.println("raising volume to: "+ vol);
    } 

    public void LowerVol(){
        //vol = vol - 1;
        vol--;
        System.out.println("lowering volume to: "+ vol);
    
    }
    public void TurnOn(){
        on = true;
    }

    public void TurnOff(){
        on = false;
    }
}
