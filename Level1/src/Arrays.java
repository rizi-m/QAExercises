
public class Arrays {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		numbers[0] = 3;
		numbers[1] = 1;
		numbers[2] = 5;
		numbers[3] = 6;
		numbers[4] = 6;
		numbers[5] = 10;
		numbers[7] = 2;
		numbers[8] = 7;
		numbers[9] = 3;
		for(int number : numbers) {
			int result = Conditionals.sumAndCheckForZero(4, number);
			System.out.println(result);
		}
		
		numbers = new int[10];
		for(int i = 0; i < numbers.length; ++i) {
			numbers[i] = i*3;
			System.out.println(numbers[i]);
		}
		
		for(int i = 0; i < numbers.length; ++i) {
			numbers[i] = numbers[i] * 10;
			System.out.println(numbers[i]);
		}
	}
}
