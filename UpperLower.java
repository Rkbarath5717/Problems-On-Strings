import java.util.*;
public class UpperLower {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the String=");
        String s=scn.nextLine();
        String m="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c >='A' && c<='Z'){
                c=(char) (c+32);
            }
            m+=c;
        }
        System.out.print("Lower case="+ m);
    }
}