import java.util.*;
public class StringToInteger {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int num = Integer.parseInt(s); //parseInt => depent on postion on number (100000,1000,100,10,1)
        System.out.println("String to Number = "+num);
    }
}
