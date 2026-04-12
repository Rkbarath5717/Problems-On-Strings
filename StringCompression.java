import java.util.*;
public class StringCompression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String result="";
        for(int i=0;i<s.length();i++){
            int count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            result=result+s.charAt(i)+" "+count + "\n";
        }
        System.out.println(result);
    }
}