import java.util.*;
public class RemoveSpecial {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c)){
                result+=c;
            }
        }
        System.out.print(result);
    }
}