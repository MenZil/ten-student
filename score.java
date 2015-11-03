package test1;


public class score {
	/**
	 * @param args
	 */
	double arr[] = { 3, 5.4, 45.5, 12, 0, 45, 67, 108.3 };

	public void px() {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("µÚ" + (i + 1) + "ÂÖÃ°Åİ£º");
			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + "    ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		score px = new score();
		px.px();
	}
}