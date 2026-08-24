package d4;

public class p10 {

		public static void main(String[] args) {
			int[] salary = {10000,15000,12000,18000,20000};
			int totalSalary = 0;
			for(int i = 0;i<salary.length;i++) {
				totalSalary += salary[i];
			}
			System.out.println(totalSalary);

		}

	}
