package edu.taiyo.firstweek;

public class first {
    public static void main (String [] args) {
        String firstName = "Taiyo";
        String secondName = "Felipe";
        
        String completeName = nomeCompleto (firstName, secondName);

        System.out.println(completeName);
    }   
    public static String nomeCompleto (String firstName, String secondName) {
        return "Result of method: " + firstName.concat(" ").concat(secondName);
    }
}
