import java.util.*;
public class CountEachChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        int count[]=new int [256];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c != ' '){
                count[c]++;
            }
        }
        for(int i=0;i<256;i++){
            if(count[i] > 0){
                 System.out.println((char)i +"->"+count[i]);
            }
        }
    }
}