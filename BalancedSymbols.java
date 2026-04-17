import java.util.*;
public class BalancedSymbols {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String s=scn.nextLine();
        int round=0;
        int curly=0;
        int square=0;
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(c=='(') round++;
            else if(c=='{') curly++;
            else if(c=='[') square++;
            else if(c==')') round--;
            else if(c=='}') curly--;
            else if(c==']') square--;

            if(round < 0 || curly < 0 || square <0 ){
                System.out.print("Not balanced");
                return;
            }
        }
        if(round == 0 && curly == 0 && square == 0){
            System.out.println("Balanced");
            return;
        }
        else{
            System.out.println("Not a valid Balanced");
        }
    }
}