import java.util.*;
public class StringToChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s =scn.nextLine();
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] =s.charAt(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("'"+arr[i]+"'");
        }
    }
}