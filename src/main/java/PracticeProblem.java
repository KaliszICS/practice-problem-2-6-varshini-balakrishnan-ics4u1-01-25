public class PracticeProblem {

	public static void main(String args[]) {
		double[] nums = {5, 2, 4, 1, 3};
		System.out.println("Least swaps: " + leastSwaps(nums));
		System.out.println("Least iterations: " + leastIterations(nums));

	}
	public static double[] copyArray(double[] nums) {
		double[] copy = new double[nums.length];
		for (int i = 0; i < nums.length; i++) {
			copy[i] = nums[i];
		}
		return copy;
	}
	public static int[] bubbleSort(double [] nums) {
		int swaps = 0;
		int steps = 0;
		boolean swapped;

		for (int j = 0; j < nums.length - 1; j++) {
			swapped = false;
			for (int i = 1; i < nums.length - j; i++) {
				steps++;
				if( nums[i -1] > nums[i]) {
					double temp = nums[i-1];
					nums[i - 1] = nums[i];
					nums[i] = temp;
					swaps += 3;
					swapped = true;
				}
			}
			if (!swapped) break;
		}
		return new int[] {swaps, steps};
	}
	public static int[] selectionSort(double[] nums) {
		int swaps = 0;
		int steps = 0;
		for (int j = 0; j < nums.length - 1; j++) {
			int smallest = j;
			for (int i = j + 1; i < nums.length; i ++) {
				steps++;
				if(nums[i] < nums[smallest]) {
					smallest = i;
				}
			}
			if (smallest != j) {
				double temp = nums[j];
				nums[j] = nums[smallest];
				nums[smallest] = temp;
				swaps += 3;
			}
		}
		return new int[]{swaps, steps};
	}
	public static int[] insertionSort(double[] nums) {
		int swaps = 0;
		int steps = 0;
		for (int i = 1; i < nums.length; i++) {
			double key = nums[i];
			int index = i - 1;

			while(index >= 0 && nums[index] > key) {
				steps++;
				nums[index + 1] = nums[index];
				swaps += 1;
				index--;
			}
			if (index >= 0) {
				steps++;
			}
			nums[index + 1] = key;
			swaps += 1;
		}
		return new int[]{swaps, steps};
	}
	public static String leastSwaps(double[] nums) {
		int[] b = bubbleSort(copyArray(nums));
		int[] s = selectionSort(copyArray(nums));
		int[] i = insertionSort(copyArray(nums));
		int bubble = b[0];
		int selection = s[0];
		int insertion = i[0];
		int min = Math.min(bubble, Math.min(selection, insertion));

		if (insertion == min) return "Insertion";
		if (bubble == min) return "Bubble";
		return "Selection";
	}
	public static String leastIterations(double[] nums) {
		int[] b = bubbleSort(copyArray(nums));
		int[] s = selectionSort(copyArray(nums));
		int[] i = insertionSort(copyArray(nums));

		int bubble = b[1];
		int selection = s[1];
		int insertion = i[1];

		int min = Math.min(bubble, Math.min(selection, insertion));
		if (insertion == min) return "Insertion";
		if (bubble == min) return "Bubble";
		return "Selection";
	}
}