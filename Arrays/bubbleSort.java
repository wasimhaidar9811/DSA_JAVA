package Arrays;


class buubleSort{
    public static void main(String[] args) {
        int[]arr={7, 2, 9, 1, 5};
        
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
      
    }
}