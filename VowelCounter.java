/*
* Author George Sigety
*/

import java.util.Scanner;

public class VowelCounter {

  static int count(String input) {
    String VOWELS = "aeiou";
    int vowelCount = 0;
    for (int i = 0; i < input.length(); i++) {
      char letter = input.charAt(i);
      for (int j = 0; j < VOWELS.length(); j++) {
        char special = VOWELS.charAt(j);
        if (letter == special) {
          vowelCount += 1;
        }
      }
    }
    return vowelCount;
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a string.");
    System.out.println("Enter Ctl-D to quit.");
    System.out.print("> ");
    VowelCounter x = new VowelCounter();
    while (scanner.hasNext()) {
      String input = scanner.next();
      int vowel_num = x.count(input);
      if (vowel_num == 1) {
        System.out.println(input + ": " + vowel_num + " " + "vowel.");
      }else {
        System.out.println(input + ": " + vowel_num + " " + "vowels.");
      }
    }
  }
}
