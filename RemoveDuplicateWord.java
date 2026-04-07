import java.util.*;
public class RemoveDuplicateWord {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String words[]=s.split(" ");

        for(int i=0;i<words.length;i++){
            boolean duplicate=false;
            for(int j=0;j<i;j++){
                if(words[i].equals(words[j])){
                    duplicate=true;
                    break;
                   }
               }
               if(!duplicate){
                System.out.print(words[i] +" ");
               }
            }
        }
    }