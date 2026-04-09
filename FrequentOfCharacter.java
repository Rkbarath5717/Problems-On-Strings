import java.util.*;
public class FrequentOfCharacter {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        int maxCount=0;
        char maxChar=' ';
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(c == s.charAt(j)){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount=count;
                maxChar=c;
            }
        }
        System.out.print("MaxCount="+maxCount);
        System.out.println();
        System.out.print("character="+maxChar);
    }
}