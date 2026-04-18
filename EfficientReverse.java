import java.util.*;
public class EfficientReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        char [] arr = s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left < right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        System.out.println("Reverse = "+ new String(arr));
    }
}