import java.util.*;
public class LowerUpper {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the String=");
        String s=scn.nextLine();
        String m="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c >='a' && c <='z'){
                c=(char)(c-32);
            }
            m=m+c;
        }
        System.out.print("Upper Case=" + m);
    }
}