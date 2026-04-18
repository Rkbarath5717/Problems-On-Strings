import java.util.*;
public class InsertCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String s = scn.nextLine();
        int pos = scn.nextInt();
        char c=scn.next().charAt(0);
        String result ="";
        for(int i=0;i<s.length();i++){
            if( i == pos){
                result=result+c;
            }
            result+=s.charAt(i);
        }
        System.out.println(result);
    }
}