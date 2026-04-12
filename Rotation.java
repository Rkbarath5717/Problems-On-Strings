import java.util.*;
public class Rotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1=scn.nextLine();
        String s2=scn.nextLine();
        if(s2.length()==s2.length() && (s1+s2).contains(s2)){
            System.out.print("Rotation");
        }
        else{System.out.print("No rotate");}
    }
}