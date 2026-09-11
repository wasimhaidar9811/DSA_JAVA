package Arrays;

public class pairSum {
    public static void main(String[] args) {
        int [] arr={1, 2, 4, 6, 8, 9, 14};
        int target=19;
        int left=0;
        int right=arr.length-1;
        boolean isFind=false;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                
                isFind=true;
                break;

            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        if(isFind){
            System.out.print(arr[left]+ "+" +arr[right]+ "=" + target);
        }else{
            System.out.println("no pair found");
        }
        
    }
}
