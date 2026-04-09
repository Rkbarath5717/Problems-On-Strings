import java.util.*;
public class PangramCheck {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        s.toLowerCase();
        boolean pangram=true;
        for(char c = 'a';c<='z';c++){
            if(s.indexOf(c)==-1){
                pangram=false;
                break;
            }
        }
        if(pangram){
            System.out.print("pangram");
        }
        else{
            System.out.print("Not pangram");
        }
    }
}