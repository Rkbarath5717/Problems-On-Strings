import java.util.*;
public class RemoveSpacesWithout {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c != ' '){
                result+=c;
            }
        }
        System.out.print(result);
    }
}