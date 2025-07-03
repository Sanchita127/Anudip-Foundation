public class count {
    public static void main(String[] args) {
    //counting digits
        int count = 0, num = 452000;
    while (num != 0) {
      num =num/ 10;
      ++count;
    }
    System.out.println("Number of digits: " + count);
  }
}