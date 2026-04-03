import java.util.*;
public class VowelsCount {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
        if(c =='a' ||c =='e' ||c =='i' ||c =='o' ||c =='u'){
                count++;
            }
        }
        System.out.print("vowels="+ count);
    }
}