import java.util.Scanner;
public class Inputfunctions {
  public static void main(String[] args) {
   Scanner readme = new Scanner(System.in);
   System.out.println("Enter a Number:");
   double a1, a2, a3, a4, a5;
   a1 = readme.nextDouble();
   a2 = 20;
   a4= 50;
   a3 = a1 / a2;
   a5 = a3*a4;
   if (a5 < 25) {
  System.out.println(a5 + "Need Improvement");
} else {
  System.out.println(a5 + "Very Good.");
}
   
  }
}
