import java.util.*;
public class ValidShuffle{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 =scn.nextLine();
        String s2 =scn.nextLine();
        String s3=scn.nextLine();
        int i=0,j=0;
        if(s1.length()+s2.length() !=s3.length()){
            System.out.println("Not valid");
            return;
        }
        for(int k=0;k<s3.length();k++){
            char c =s3.charAt(k);
            if(i<s1.length() && c==s1.charAt(i)){
                i++;
            }
            else if(j<s2.length() && c==s2.charAt(j)){
                j++;
            }
            else{
                System.out.print("Not valid shuffle");
                return;
            }
        }
        System.out.print("valid shuffle");
    }
}