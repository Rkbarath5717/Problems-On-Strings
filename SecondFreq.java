import java.util.*;
public class SecondFreq{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int freq[]=new int [256];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c]++;
        }
        int first =0;
        int second=0;
        for(int i=0;i<256;i++){
            if(freq[i]>first){
                second=first;
                first=freq[i];
            }
            else if(freq[i] > second && freq[i] != first){
                second=freq[i];
            }
        }
        for(int i=0;i<256;i++){
            if(freq[i]==second){
                System.out.println((char) i);
            }
        }
    }
}