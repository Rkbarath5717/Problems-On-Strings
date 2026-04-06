import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String sub=scn.nextLine();
        boolean found=true;
        for(int i=0;i<=s.length()-sub.length();i++){
            int j;
            for( j=0;j<sub.length();j++){
                if(s.charAt(i+j) != sub.charAt(j)){
                    found = false;
                    break;
                }
            }
            if(j ==sub.length()){
                found=true;
                break;
            }
        }
        if(found){
            System.out.print("subString found");
        }
        else{
            System.out.print("Not found");
        }
    }
}