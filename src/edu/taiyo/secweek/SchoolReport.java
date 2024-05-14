package edu.taiyo.secweek;
public class SchoolReport {
    public static void main(String[] args) {
        int finalMedia = 6;
        if(finalMedia < 6)
            System.out.println("DISAPPROVED");
        else if(finalMedia == 6)
            System.out.println("educational recuperation");
        else
            System.out.println("APPROVED");
    }
}