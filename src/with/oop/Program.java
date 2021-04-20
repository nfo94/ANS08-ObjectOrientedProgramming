package with.oop;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Triangulo x, y;
    x = new Triangulo();
    y = new Triangulo();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the measures of triangle X: ");
    x.a = scanner.nextDouble();
    x.b = scanner.nextDouble();
    x.c = scanner.nextDouble();

    double areaX = x.area();

    System.out.println("Enter the measures of triangle Y: ");
    y.a = scanner.nextDouble();
    y.b = scanner.nextDouble();
    y.c = scanner.nextDouble();

    double areaY = y.area();

    System.out.println("Triangle X area: " + areaX);
    System.out.println("Triangle Y area: " + areaY);

    if (areaX > areaY) {
      System.out.println("Larger area is X");
    } else {
      System.out.println("Larger area is Y");
    }

    scanner.close();
  }
}
