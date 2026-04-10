import java.util.*;
public class CountCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c != ' '){
                count++;
            }
        }
        System.out.print(count);
    }
}