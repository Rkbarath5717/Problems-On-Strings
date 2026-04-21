import java.util.*;
public class AlphaHill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            char c ='A';

            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            c = (char) (c-2);
            for(int j=1;j<i;j++){
                System.out.print(c);
                c--;
            }
            System.out.println();
        }
    }
}