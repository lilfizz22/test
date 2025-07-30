public class Scope {
  // instance variables
  private String name = "Scope";

  public void method1() {
    // local variable
    int x = 10;

    // "x" is only visible to method1
    System.out.println("x = " + x);

    // "name" is visible to method1
    System.out.println("name = " + name);
  }

  public void method2() {
    // local variable
    int y = 20;

    // "y" is only visible to method2
    System.out.println("y = " + y);

    // "name" is visible to method2
    System.out.println("name = " + name);
  } 
}


