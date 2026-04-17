import java.util.*;
public class AlphabetOrderMethod{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String words[]=s.trim().split("\\s+");
        Arrays.sort(words);
        for(String order : words){
            System.out.print(order+" ");
        }
    }
}