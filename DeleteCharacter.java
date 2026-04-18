import java.util.*;
public class DeleteCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String s =scn.nextLine();
        int pos = scn.nextInt();
        String result ="";
        for(int i=0;i<s.length();i++){
            if( i ==pos){
                continue;
            }
            result=result+s.charAt(i);
        }
        System.out.println(result);
    }
}