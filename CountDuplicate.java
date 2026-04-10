import java.util.*;
public class CountDuplicate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j) && result.indexOf(s.charAt(i)) == -1){
                    result+=s.charAt(i);
                }
            }
        }
        System.out.print(result);
    }
}