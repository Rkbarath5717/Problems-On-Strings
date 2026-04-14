import java.util.*;
public class vowelsRemove {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if("aeiouAEIOU".indexOf(c)==-1){
                result+=c;
            }
        }
        System.out.println("Removed vowels after="+result);
    }
}