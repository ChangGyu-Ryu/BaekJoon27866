import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String word = sc.next();
    int order = sc.nextInt();
    int index = order - 1;
    char ans = word.charAt(index);

    System.out.println(ans);

  }

}
