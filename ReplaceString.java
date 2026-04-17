import java.util.*;
public class ReplaceString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s =scn.nextLine();
        String old=scn.nextLine();
        String New=scn.nextLine();
        String result=s.replace(old,New);
        System.out.println("After remove= "+result);
    }
}