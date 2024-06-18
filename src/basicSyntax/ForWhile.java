package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1.
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.print("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println( i );
			}
		}
		//2.
		String [] names = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};

		  for (String name : names) {
		    if (name.equals("Java")) {
		      System.out.println("現在学習中の言語はJavaです。");
		      continue;
		    } else if (name.equals("HTML")) {
		      System.out.println("HTMLはプログラミング言語ではありません。");
		       break;
		    } else {
		      System.out.println(name);
		    }
		  }
	}
	
}