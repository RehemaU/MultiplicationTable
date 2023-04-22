import java.util.Scanner;

public class MultiplicationTable_2 {
	public static void main (String args[])
	{
		//그냥 강의 듣기 전에 써보는 코드
		
		//사용자에게 숫자를 입력받아 해당하는 숫자의 구구단을 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 하나 입력해주세요.");
		int num;
		num = scan.nextInt();
		System.out.println("해당 숫자의 구구단을 출력합니다.");
		System.out.printf("%d * 1 = %d\n", num,(num*1));
		System.out.printf("%d * 2 = %d\n", num,(num*2));
		System.out.printf("%d * 3 = %d\n", num,(num*3));
		System.out.printf("%d * 4 = %d\n", num,(num*4));
		System.out.printf("%d * 5 = %d\n", num,(num*5));
		System.out.printf("%d * 6 = %d\n", num,(num*6));
		System.out.printf("%d * 7 = %d\n", num,(num*7));
		System.out.printf("%d * 8 = %d\n", num,(num*8));
		System.out.printf("%d * 9 = %d\n", num,(num*9));
		scan.close();
		
		//구구단 1~9단까지 모두 구현하는 프로그램
		System.out.println("1~9단 모두 구현합니다.");
		int i,n;
		for(i=1;i<10;i++)
		{
			for(n=1;n<10;n++)
			{
				System.out.printf("%d*%d=%d\n",i,n,(i*n));
			}
		}
	}
}
