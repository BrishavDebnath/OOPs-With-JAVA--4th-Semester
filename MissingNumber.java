public class MissingNumber {
    public static void main(String []args){
        int arr[]=new int[]{1,2,4,5};
        int length=arr.length;
        int n=length+1;
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for (int i=0;i<length;i++){
            sum2=sum2+arr[i];
        }
        int missingnum=sum1-sum2;
        System.out.println("Given Array:");
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("The Missing number is:"+missingnum);
    }
    
}
