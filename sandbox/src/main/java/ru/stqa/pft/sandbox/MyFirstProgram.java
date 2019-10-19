package ru.stqa.pft.sandbox;

import java.awt.*;

public class MyFirstProgram {

  public static void main(String[] args) {

  Square s = new Square(5);
  System.out.println("Owód " + s.l + " = " + s.area());

  Rectangle r = new Rectangle(4, 6);
  System.out.println("Bok " + r.a + " H " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
}

}