import java.util.*;
public class AnagramCountMethod {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String s1=scn.nextLine().toLowerCase();
        String s2=scn.nextLine().toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println("Not a angram");
            return;
        }

        int count [] = new int [26];

        for(int i=0;i<s1.length();i++){
                char c= s1.charAt(i);
                count[c - 'a']++;
        }
        for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            count[c - 'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i] != 0){
                System.out.print("Not a Anagram");
                return;
            }
        }
        System.out.print("Anagram");
    }
}