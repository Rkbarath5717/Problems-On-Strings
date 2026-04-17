import java.util.*;
public class SpecifyRemoveLogic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String remove=scn.nextLine();
        String temp="";
        boolean found=false;
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(c !=' '){
                temp=temp+c;
            }
            else{
                if(temp.equals(remove)){
                    found=true;
                    temp="";
                    continue;
                }
                System.out.print(temp+" ");
                temp="";
            }
        }
        if(temp.equals(remove)){
            found=true;
        }
        else{
            System.out.print(temp+" ");
        }
        if(!found){
            System.out.print("Not found");
        }
    }
}