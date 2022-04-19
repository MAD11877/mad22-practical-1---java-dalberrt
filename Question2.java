import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner measureScan = new Scanner(System.in);     //should u use the same scanner for two thingys?
    System.out.print("Enter your height(m): ");
    double height = measureScan.nextDouble();

    System.out.print("Enter your weight(kg): ");
    double weight = measureScan.nextDouble();
    double bmi = weight / (height*height);
    System.out.print("Your BMI is: " + bmi);

    measureScan.close();
  }
}
