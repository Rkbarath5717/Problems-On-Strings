import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String original="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(original.indexOf(c) == -1){
                original+=c;
            }
        }
        System.out.print(original);
    }
}