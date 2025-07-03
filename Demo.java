public class Demo 
{
//Largest element in array
    public static void main(String[] args) 
    {
        int[] arr= {110,2,3,4,23,6};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
            largest=arr[i];   
            }       
        }
    System.out.println(largest);
        
    }
}
