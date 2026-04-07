import java.util.*;
public class SmallestWord {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String word="";
        String smallest;
        //String smallest="";
        for(int i=0;i<=s.length();i++){
            char c;
            if(i==s.length()){
                 c =' ';
            }
            else{
                 c=s.charAt(i);
            }
            if(c !=' '){
                word=word+c;
            }
            else{
                if(word.length() > 0){
                    if(smallest.equals("") || word.length() < smallest.length()){
                        smallest=word;
                    }
                }
                word="";
            }
        }
        System.out.print("Smallest ="+smallest);
    }
}