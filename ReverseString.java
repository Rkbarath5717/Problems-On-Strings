import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the String= ");
        String s=scn.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.print("Reversing : "+" "+ rev);
    }
}