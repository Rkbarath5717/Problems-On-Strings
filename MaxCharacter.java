import java.util.*;
public class MaxCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int max = s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) > max){
                max=s.charAt(i);
            }
        }
        System.out.println("Max Character = "+(char) max +"  "+ max);
    }
}