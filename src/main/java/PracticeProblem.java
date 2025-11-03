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
		return nums;
	}
	public static int[] bubbleSort(double [] nums) {
		double[] arr = copyArray(nums);
		int swaps = 0;
		int steps = 0;
		boolean swapped;

		for (int j = 0; j < arr.length - 1; j++) {
			swapped = false;
			for (int i = 1; i < arr.length - j; i++) {
				steps++;
				if( arr[i -1] > arr[i]) {
					double temp = arr[i-1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					swaps += 3;
					swapped = true;
				}
			}
			if (!swapped) break;
		}
		return new int[] {swaps, steps};
	}
	public static int[] selectionSort(double[] nums) {
		double[] arr = copyArray(nums);
		int swaps = 0;
		int steps = 0;
		for (int j = 0; j < arr.length - 1; j++) {
			int smallest = j;
			for (int i = j + 1; i < arr.length; i ++) {
				steps++;
				if(arr[i] < arr[smallest]) {
					smallest = i;
				}
			}
			if (smallest != j) {
				double temp = arr[j];
				arr[j] = arr[smallest];
				arr[smallest] = temp;
				swaps += 3;
			}
		}
		return new int[]{swaps, steps};
	}
	public static int[] insertionSort(double[] nums) {
		double[] arr = copyArray(nums);
		int swaps = 0;
		int steps = 0;
		for (int i = 1; i < arr.length; i++) {
			double key = arr[i];
			int index = i - 1;

			while(index >= 0 && arr[index] > key) {
				steps++;
				arr[index + 1] = arr[index];
				swaps += 1;
				index--;
			}
			if (index >= 0) {
				steps++;
			}
			arr[index + 1] = key;
			swaps += 1;
		}
		return new int[]{swaps, steps};
	}
	public static String leastSwaps(double[] nums) {
		int[] b = bubbleSort(nums);
		int[] s = selectionSort(nums);
		int[] i = insertionSort(nums);
		int bubble = b[0];
		int selection = s[0];
		int insertion = i[0];
		int min = Math.min(bubble, Math.min(selection, insertion));

		if (bubble == min) return "Bubble";
		if (insertion == min) return "Insertion";
		return "Selection";
	}
	public static String leastIterations(double[] nums) {
		int[] b = bubbleSort(nums);
		int[] s = selectionSort(nums);
		int[] i = insertionSort(nums);

		int bubble = b[1];
		int selection = s[1];
		int insertion = i[1];

		int min = Math.min(bubble, Math.min(selection, insertion));
		if (bubble == min) return "Bubble";
		if (insertion == min) return "Insertion";
		return "Selection";
	}
}