import java.util.*;
public class LexicographicallyLogic{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        String word="";
        String smallest="";
        boolean first=true;
        for(int i=0;i<s.length();i++){
            if(i==s.length() || s.charAt(i)==' '){
                if(first){
                    smallest=word;
                    first=false;
                }
                else{
                    int j=0;
                    while(j<word.length() && j<smallest.length()){
                        if(word.charAt(j) < smallest.charAt(j)){
                            smallest=word;
                            break;
                        }
                        else if(word.charAt(j) > smallest.charAt(j)){
                            break;
                        }
                        j++;
                    }
                if(j==word.length() && word.length()<smallest.length()){
                    smallest=word;
                }
            }
            word="";
        }
        else{
            word=word+s.charAt(i);
        }

      }
        System.out.println("smallest =" + word);
    }
}