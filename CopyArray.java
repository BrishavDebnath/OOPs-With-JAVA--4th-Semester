public class CopyArray {
    public static void main(String []args){
        int arr[]=new int[]{1,2,3,4,5,6,7};
        int length=arr.length;
        int arr1[]=new int[length+10];
        for (int i=0;i<length;i++){
            arr1[i]=arr[i];
        }
        System.out.println("Original Array:");
        for (int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Copied Array:");
        for( int i=0;i<length;i++){
            System.out.println(arr1[i]);

        }
    }
    
}
