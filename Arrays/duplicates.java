package Arrays;

public class duplicates {
    public static void main(String[] args) {
        int [] arr={1, 1, 2, 2, 3, 4, 4};
        int left=0;
        int right=1;
        while(left<arr.length && right<arr.length){
            if(arr[left]==arr[right]){
                right++;
            }else if(arr[left]!=arr[right]){
                left++;
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                
                right++;
            }
        }
        // int j=0;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]!=arr[j]){
        //         j++;
        //         arr[j]=arr[i];
                
        //     }
        // }
        for(int i=0;i<=left;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
