// public class ArrayCalculator extends ArrayMaker {
// import ArrayMaker;
import java.util.Arrays;
import java.util.Scanner;


//   public String somethingnew;
//
//   public Student(String name) {
//     super(name);
//     somethingnew = "surprise!";
//   }

public class ArrayCalculator {
  public static void main(String[] args) {
    int[] anArray = new int[]{1,2,3,4,5,6};
    System.out.println("What is the operator?");
    Scanner textTaker = new Scanner(System.in);
    String operator = textTaker.next();
    System.out.println("operator " + operator);
    // ArrayMaker newArray = new ArrayMaker();
    // System.out.pl(Arrays.toString(newArray.anArray));

  //
  //   int x = 0;
    int total = 1;
    switch(operator) {
      case "+":
        total = 0;
        for (int i=0; i<anArray.length; i++ ) {
          total += anArray[i];
        }
        break;
      case "*":
        total = 1;
        for (int i=0; i<anArray.length; i++ ) {
          total *= anArray[i];
        }
        break;

    }

    System.out.println("total = " + total);
    }

  }
