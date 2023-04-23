import java.util.Scanner;

public class MultiplicationTable_2 {
//	public static void main (String args[])
//	{
//		//그냥 강의 듣기 전에 써보는 코드
//		
//		//사용자에게 숫자를 입력받아 해당하는 숫자의 구구단을 출력하는 프로그램
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 하나 입력해주세요.");
//		int num;
//		num = scan.nextInt();
//		System.out.println("해당 숫자의 구구단을 출력합니다.");
//		System.out.printf("%d * 1 = %d\n", num,(num*1));
//		System.out.printf("%d * 2 = %d\n", num,(num*2));
//		System.out.printf("%d * 3 = %d\n", num,(num*3));
//		System.out.printf("%d * 4 = %d\n", num,(num*4));
//		System.out.printf("%d * 5 = %d\n", num,(num*5));
//		System.out.printf("%d * 6 = %d\n", num,(num*6));
//		System.out.printf("%d * 7 = %d\n", num,(num*7));
//		System.out.printf("%d * 8 = %d\n", num,(num*8));
//		System.out.printf("%d * 9 = %d\n", num,(num*9));
//		scan.close();
//		
//		//구구단 1~9단까지 모두 구현하는 프로그램
//		System.out.println("1~9단 모두 구현합니다.");
//		int i,n;
//		for(i=1;i<10;i++)
//		{
//			for(n=1;n<10;n++)
//			{
//				System.out.printf("%d*%d=%d\n",i,n,(i*n));
//			}
//		}
//		
//		//while문을 사용해서 구구단 프로그래밍 해보기
//		int i=1;
//		int n=1;
//		while (i<10)
//		{
//			while (n<10)
//			{
//				System.out.println(i*n);
//				n++;
//			}
//			n=1;	//n의 숫자를 다시 1로 초기화를 해줘야 두번째 while문이 실행되므로!!! 꼭 초기화를 해줘야한다.
//			i++;
//		}
//		
//		//사용자가 입력한 숫자 값에 해당하는 단을 출력하나, 1이하 10이상이면 잘못된 입력값이라는 메시지를 출력한다.
//		System.out.println("구구단을 출력하겠습니다. 출력할 단을 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		if (num<2||num>10)
//		{
//			System.out.println("2이상, 9이하의 숫자를 입력해주세요.");
//		}
//		else
//		{
//			for (int i=1;i<10;i++)
//			{
//				System.out.printf("%d * %d = %d\n",num,i,num*i);
//			}
//		}
//		
//		//배열을 활용해 구구단을 구현하는 경험을 한다.
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] result = new int[9];
//		for(int i=0;i<result.length;i++)
//		{
//			//계산 결과를 배열에 저장
//			result[i]=n*(i+1);
//		}
//		for (int i=0;i<result.length;i++)
//		{
//			//계산 결과를 화면에 출력
//			System.out.println(result[i]);
//		}
//		//for문 안에 i=0 ; i<=result.length 로 하면 배열의 크기를 초과하기 때문에 (result[0~9]) <= >= 가 아니라 < > 로 해줘야한다.
//		
//		//추가 요구사항 2~9단까지 배열을 사용하여 출력
//		int[] result = new int[9];
//		for (int j=2;j<10;j++)
//		{
//			for(int i=0;i<result.length;i++)
//			{
//				result[i]=j*(i+1);
//				System.out.println(result[i]);
//				System.out.println("--------------");
//			}
//		}
//	}
//	

//	public static int[] calculate(int times) {
//		int[] result = new int[9];
//		for (int i=0;i<result.length;i++) {
			//계산 결과를 배열에 저장
//			result[i]=i*(i+1); //너무 멍청하죠? 이러면 0*1 1*2 2*3 이 되죠?
//			result[i]=times*(i+1); //times를 괜히 받아오는게 아니죠?
//		}
//		return result;
//	}
//	
//	public static void print(int[] result) {
//		for (int i=0;i<result.length;i++) {
//			//계산 결과를 화면에 출력
//			System.out.println(result[i]);
//		}
//	}
//	
//	public static void main(String[] args) {
//		for (int j=2;j<10;j++) {
//			//calculate와 print 메서드 활용해 구구단 구현하기
//			int[] gugudan = calculate(j);
//			print(gugudan);
//			System.out.println();
//		}
//	}
	
	//클래스를 활용하여 구구단 다시 구현
	public static void main(String[] args) {
		for (int j=2;j<10;j++) {
			//멀티플테이블에서 구현한 calculate와 print 메서드를 호출해서 여기서 구현해보기
			int[] gugudan = MultiplicationTable_1.calculate(j);
			MultiplicationTable_1.print(gugudan);
			System.out.println();
		}
	}
}
