import java.util.*;
public class ConsonanceRemove {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine().toLowerCase();
        String result="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                result+=c;
            }
        }
        System.out.println(result);
    }
}