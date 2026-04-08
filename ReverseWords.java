import java.util.*;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String word="";
        for(int i=0;i<=s.length();i++){
            char c;
            if(i==s.length()){
                c=' ';
            }
            else{
                c=s.charAt(i);
            }
            if(c !=' '){
                word+=c;
            }
            else{
                for(int j=word.length()-1;j>=0;j--){
                    System.out.print(word.charAt(j));
                }
                System.out.print(" ");
                word="";
            }
        }
    }
}