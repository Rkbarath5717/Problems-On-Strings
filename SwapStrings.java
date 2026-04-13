import java.util.*;
public class SwapStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String s1=scn.nextLine();
        String s2=scn.nextLine();
        s1=s1+s2;
        s2 =s1.substring(0,s1.length()-s2.length());
        s1 =s1.substring(s2.length());
        System.out.println("After the swap");
        System.out.println("String change="+s1);
        System.out.println("second string"+s2);
    }
}