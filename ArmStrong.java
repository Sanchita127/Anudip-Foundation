import java.util.*;
public class ArmStrong {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Starting value: ");
      int Start=sc.nextInt();
      System.out.println("Enter ending value: ");
      int end=sc.nextInt();
      PrintArmstrongNO(Start,end);
      sc.close();
    }
    public static void PrintArmstrongNO(int Start ,int end)
    {
      System.out.println("Armstrong numbers between "+ Start + " and " + end + ":");
      for(int num=Start;num<=end;num++){
      int Original=num;
      int sum=0;
      int temp=num;
      while(temp>0){
        int digit=temp%10;

        int cube=1;
        for(int i=1;i<=3;i++){
          cube=cube*digit;
        }
        sum=sum+cube;
        temp=temp/10;
      }
      if(sum ==Original)
      {
        System.out.println(Original);
      }

    }
  }
}
