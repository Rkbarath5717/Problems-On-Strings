import java.util.*;
public class Lexicographically {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();
        String words[]=s.split(" ");
        String smallest=words[0];
        for(int i=0;i<words.length;i++){
            if(words[i].compareTo(smallest)<0){
                smallest=words[i];
            }
        }
        System.out.print(smallest);
    }
}