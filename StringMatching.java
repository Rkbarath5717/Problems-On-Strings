import java.util.*;
public class StringMatching {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1=scn.nextLine();
        String s2=scn.nextLine();
        String match="";
        String notMatch="";
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(s2.contains(c +"")){
                match+=c;
            }
            else{
                notMatch+=c;
            }
        }
        System.out.println("Matching= "+match);
        System.out.println("NotMatching="+notMatch);
    }
}