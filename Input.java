import java.util.Scanner;
public class Input {
  public static void main(String[] args){
    System.out.println("yo yo yo!  What your name is?");
    Scanner textTaker = new Scanner(System.in);
    String name = textTaker.next();
    System.out.println("What it is " + name);
  }
}
