// public class ArrayMaker {
//   public static void main(String[] args) {
//     int[] anArray = new int[6];
//     int num = 94;
//     String name = "Tupac";
//     for (int i = 0; i< 6; i++) {
//       anArray[i]=i;
//     }
//     anArray[0]= 1; ...
//     // or int[] anArray = new int[]{1,2,3,4,5,6};
//   }
// }

// Add contents of array to a sum
// public class ArrayMaker{
//   public static void main(String[] args) {
//     int[] anArray = new int[]{1,2,3,4,5,6};
//     int sum = 0;
//     for (int i = 0; i < anArray.length ; i++) {
//       sum + = anArray[i];
//     }
//   }

// Add contents of array to a sum
public class ArrayMaker{
  private int mine = 2;   // Can't access outside of class
  public static int yours = 4; // Anyone can see it  ... and has to be static since main is static
  public static void main(String[] args) {
    int[] anArray = new int[]{1,2,3,4,5,6};
    int sum = 0;
    for (int i = 0; i < anArray.length ; i++) {
      sum += anArray[i];
    }
    System.out.println(sum);
  }
}
