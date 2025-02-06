public class SecondLargest {
    public static void main(String []args){
        int arr[]=new int[]{2,1,4,3,6,5,7,9,8,11,23,44,32,14,22,45,65,51};
        int largest=0;
        int secondLargest=0;
        int length=arr.length;
        for (int i=0;i<length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
                
            }
            else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("The Second Largest Element in the array is:"+" "+secondLargest);

    }
    
}
