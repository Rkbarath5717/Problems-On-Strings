import java.util.*;
public class AlphabetComparison {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s =scn.nextLine();
        String words []=s.trim().split("\\s+");
        for(int i=0;i<words.length-1;i++){
            for(int j=0;j<words.length-i-1;j++){
                if(words[j].compareTo(words[j+1])>0){
                    String temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
            }
        }
        for(String word:words){
            System.out.print(word+" ");
        }
    }
}