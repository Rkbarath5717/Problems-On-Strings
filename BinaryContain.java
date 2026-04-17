import java.util.*;
public class BinaryContain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s =scn.nextLine();
        boolean binary = true;
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);

            if(c != '0' && c!='1'){
                binary=false;
                break;
            }
        }
        if(binary){
            System.out.print("yes");
        }
        else{
            System.out.print("N0");
        }
    }
}