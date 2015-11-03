import java.util.Scanner;

public class score {
	public static void main(String[] args) {
		String name[]=new String[10];
		int score[] = new int[10];
		for (int i = 0; i < name.length; i++) {
			System.out.println("please input student "+(i+1)+" name:");
			Scanner scan = new Scanner(System.in);
			name[i] = scan.next();
			System.out.println("please input student "+(i+1)+" score:");
			score[i]= scan.nextInt();
		}
		System.out.println("--------------------");
		System.out.println("源数据为：");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+":");
			System.out.println(score[i]);
		}
		System.out.println("--------------------");
		System.out.println("按成绩排序后：");
		int stemp;
		String ntemp;
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length -i - 1; j++) {
				if (score[j] < score[j + 1]) {
					stemp = score[j];
					ntemp = name[j];
					
					score[j] = score[j + 1];
					name[j] = name[j+1];
					
					score[j + 1] = stemp;
					name[j+1] = ntemp;
				}
			}
		}
		for (int k = 0; k < score.length; k++) {
			System.out.print(name[k]+":");
			System.out.println(score[k]);
		}
	}
}
