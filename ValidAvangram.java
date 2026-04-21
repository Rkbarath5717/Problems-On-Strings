import java.util.*;
public class ValidAvangram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        scn.nextLine();
        String [] arr = new String [n];

        for(int i=0;i<n;i++){
            arr[i] = scn.nextLine();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].length() != arr[j].length()){
                    System.out.print("Not valid");
                    continue;
                }
                char a[]=arr[i].toCharArray();
                char b[]=arr[j].toCharArray();

                Arrays.sort(a);
                Arrays.sort(b);

                if(Arrays.equals(a,b)){
                    System.out.println("valid Anagram = " + arr[i] + "&" + arr[j]);
                }
                else{
                    System.out.println("Not valid");
                }
            }
        }
    }
}