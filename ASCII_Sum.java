import java.util.*;
public class ASCII_Sum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s =scn.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            sum=sum+c;
        }
        System.out.print("Total Sum="+sum);
    }
}