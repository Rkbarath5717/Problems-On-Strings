import java.util.*;
public class UpperLowerCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int Upper=0;
        int Lower=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >='A' && c <='Z'){
                Upper++;
            }
            else if(c >= 'a' && c<='z'){
                Lower++;
            }
        }
        System.out.println("Upper count="+Upper);
        System.out.println("Lower count="+Lower);
    }
}