import java.util.*;
public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(i==0 || s.charAt(i-1)==' '){
                result=result+Character.toUpperCase(c);
            }
            else{
                result+=c;
            }
        }
        System.out.print(result);
    }
}