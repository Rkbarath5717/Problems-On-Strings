import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s1=scn.nextLine().toLowerCase();
        String s2=scn.nextLine().toLowerCase();

        char [] a=s1.toCharArray();
        char [] b=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
            System.out.print("It is a Anagram");
        }
        else{
            System.out.print("Not a anagram");
        }

    }
}