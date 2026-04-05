import java.util.*;
public class FirstNonRepeat {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)){
                System.out.print(c);
                break;
            }
        }
    }
}