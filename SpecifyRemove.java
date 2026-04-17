import java.util.*;
public class SpecifyRemove {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s =scn.nextLine();
        String remove=scn.nextLine();
        String words[]=s.split(" ");
        String result="";
        for(int i=0;i<words.length;i++){
            if(words[i].equals(remove)){
                continue;
            }
            result=result+words[i]+" ";
        }
        System.out.println("remaining="+result.trim());
    }
}