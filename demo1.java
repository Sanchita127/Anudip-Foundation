public class demo1 {
   static int factorial (int n)
    {
        int a=1,i;       //int factorial=1;
                         // for(int i=n;i>=1;i--)
                         //{
                         //factorial=factorial*i;
                         //}
        for(i=2;i<=n;i++){
            a*=i;
        }
        return a;
    }
    public static void main(String[] args) {
       demo1 dm=new demo1();
        int num=5;
      System.out.println(factorial(5));  
    }
}