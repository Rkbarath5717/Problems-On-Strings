import java.util.*;
public class LongestSmallestWord {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String [] words=s.split(" ");
        String Longest=words[0];
        String Smallest=words[0];
        for(int i=0;i<words.length;i++){
            if(words[i].length() >= Longest.length()){
                    Longest=words[i];
            }
        }
        for(int i=0;i<words.length;i++){
            if(words[i].length() < Smallest.length()){
                Smallest=words[i];
            }
        }
        System.out.print("Longest word ="+Longest);
        System.out.println();
        System.out.print("Shortest word ="+Smallest);
    }
}