import java.util.*;
public class StringToNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s =scn.nextLine();
        int num=0;
        int start=0;
        boolean isNegative=false;
        if(s.charAt(0)=='-'){
            isNegative=true;
            start=1;
        }
        for(int i=start;i<s.length();i++){
            char c =s.charAt(i);
            int digit=c-'0';
            num = num*10+digit;
        }
        if(isNegative){
            num = -num;
        }
        System.out.print(num);
    }
}