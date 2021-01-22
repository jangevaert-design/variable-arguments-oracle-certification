package edu.cnm.deepdive;

import java.util.Arrays;

public class VariableArguments {

//  public static void main(String[] args) {
//
//  }

  public static void main(String...args) {
    System.out.println(args.length);
    print(args);
    print("Java");
    print("this", "is", "my", "String", "array");
  }

  private static void print(String...myArguments) {
    System.out.println(Arrays.toString(myArguments));
  }
}
