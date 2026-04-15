import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s =scn.nextLine();
        String longest="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                String rev="";
                for(int k=sub.length()-1;k>=0;k--){
                    rev+=sub.charAt(k);
                }
                if(sub.equals(rev)){
                    if(rev.length() > longest.length()){
                        longest=rev;
                    }
                }
            }
        }
        System.out.print("longest="+longest);
    }
}