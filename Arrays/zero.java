package Arrays;

public class zero {
    public static void main(String[] args) {
        int [] arr={1, 0, 0, 3, 12};
        int left=0;
        int right=0;
        while(left<arr.length && right<arr.length){
            if(arr[right]==0){
                right++;
            }else if(arr[right]!=0){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                right++;
                left++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
