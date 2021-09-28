package git_exam1;

public class World {
	static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; ++i)
			result *= i;
		return result;
	}

	static int sum(int n) {
		int result = 0;
		for (int i = 1; i <= n; ++i)
			result += i;
		return result;
	}

	public static void main(String[] args) {
		for (int i = 5; i <= 10; ++i)
			System.out.println(sum(i));
		for (int i = 5; i <= 10; ++i)
			System.out.println(factorial(i));

	}
	
}
