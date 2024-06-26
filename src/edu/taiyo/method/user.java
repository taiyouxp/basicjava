package edu.taiyo.method;

public class user {
    public static void main(String[] args) {
        
        projsmrtv smartTv = new projsmrtv();
        smartTv.TurnOn();
        System.out.println("new stats: tv on = " + smartTv.on);

        System.out.println("tv on? " + smartTv.on);
        System.out.println("actual channel: " + smartTv.channel);
        System.out.println("actual vol: "+ smartTv.vol);

        smartTv.RaiseChannel();
        smartTv.LowerChannel();
        smartTv.ChangeChannel(7);
        System.out.println("actual channel: " + smartTv.channel);

        smartTv.LowerVol();
        smartTv.LowerVol();
        smartTv.LowerVol();
        smartTv.RaiseVol();
        System.out.println("actual vol: " + smartTv.vol);


        smartTv.TurnOff();
        System.out.println("new stats: tv on = " + smartTv.on);
    }

}
