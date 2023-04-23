import java.util.Scanner;

public class Gugudan_1
{
	public static void main (String[] args)
	{
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자입력");
//		int num = scanner.nextInt();
//		for(int i=2;i<=num;i++)
//		{
//			for(int j=2;j<=num;j++)
//			{
//				System.out.printf("%d*%d=%d\t",i,j,(i*j));
//			}
//			System.out.println();
//		}
		
//		Scanner scan = new Scanner(System.in);
//		int num1=scan.nextInt();
//		int num2=scan.nextInt();
//		for (int i=2;i<=num1;i++)
//		{
//			for (int j=1;j<=num2;j++)
//			{
//				System.out.printf("%d*%d=%d\t",i,j,(i*j));
//			}
//			System.out.println();
//		}	//위와 아래는 같은 출력값을 내는 프로그래밍이다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 두개를 쉼표로 나누어서 입력하세요. ex)7,8");
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		for (int i=2;i<=first;i++)
			{
				for (int j=1;j<=second;j++)
				{
					System.out.printf("%d*%d=%d\t",i,j,(i*j));
				}
				System.out.println();
			}
	}
}
