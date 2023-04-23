
public class MultiplicationTableMain {
	public static void main(String[] args) {
		for (int j=2;j<10;j++) {
			int[] result = MultiplicationTable_1.calculate(j);
			MultiplicationTable_1.print(result);
			System.out.println();
		}
	}
}
