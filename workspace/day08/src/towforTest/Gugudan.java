package towforTest;

public class Gugudan {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "단 \t\t");
		}
		System.out.println();

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %2d \t", j, i, j * i);
			}
			System.out.println();
		}
		System.out.println("=====================================");

		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}

		System.out.println("===========================================");

		for (int i = 1; i < 10; i += 3) {// 3 단씩 출력되기 때문에 한 줄이 넘어갈 때 +3
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 3; k++) {// 한 줄에 3개의 단이 출력 됨
					if (j == 0)
						System.out.printf("%d단 \t\t", i + k);// 몇 단인지 출력해주기 위한 조건
					else
						System.out.printf("%d * %d = %2d \t", (i + k) , j,  (i + k) * j );
				}
				System.out.println();
			}
		}
	}
}