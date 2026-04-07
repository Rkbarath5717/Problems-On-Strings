import java.util.*;
public class PrintEachCharacter {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            System.out.println(c);

        }
    }
}