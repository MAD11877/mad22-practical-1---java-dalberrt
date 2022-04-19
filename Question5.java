import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of integers: ");
    int inputs = in.nextInt();
    int[] inputList = new int[inputs];

    for (int i = 0; i < inputs; i++){
      int number = in.nextInt();
      inputList[i] = number;
    }

    int highestNum = 0;
    int highestCount = 0;
    for (int i : inputList){
      int count = 0;
      for (int x : inputList){
        if (x == i){
          count += 1;
        }
      }
      if (count > highestCount){
        highestCount = count;
        highestNum = i;
      }
      count = 0;
    }

    System.out.println(highestNum);

    in.close();
  }
}
