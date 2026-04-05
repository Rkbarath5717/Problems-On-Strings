import java.util.*;
public class RemoveSpaceString {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        StringBuffer N= new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                N.append(s.charAt(i));
            }
        }
        System.out.print(N);
    }
}