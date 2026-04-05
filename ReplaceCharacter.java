import java.util.*;
public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        char old=scn.next().charAt(0);
        char newChar=scn.next().charAt(0);
        String N="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c == old){
                    N+=newChar;
            }
            else{
                N+=c;
            }
        }
        System.out.println("New word=" + N);
    }
}