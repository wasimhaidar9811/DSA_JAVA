package Arrays;

public class palindromic {
    public static void main(String[] args) {
        int [] arr={1, 2, 3, 2, 1};
        int left=0;
        int right=arr.length-1;
        boolean palindrome=true;
        while(left<right){
            if(arr[left]!=arr[right]){
                palindrome=false;
            }
            left++;
            right--;
        }
        if(palindrome){
            System.out.println("it is palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
