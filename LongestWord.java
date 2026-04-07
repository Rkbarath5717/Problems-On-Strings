import java.util.*;
public class LongestWord {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String word="";
        String longest="";
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
                if(word.length() > 0){
                    if(longest.equals(' ')|| word.length() > longest.length()){
                            longest=word;
                    }
                }
                word="";
            }
        }
        System.out.print(longest);
    }
}