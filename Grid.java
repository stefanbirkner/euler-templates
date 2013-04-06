import java.util.*;

public class ProblemX {
	public static void main(String... args) {
		System.out.println();
	}

	private static int[][] readGridOfNumbers() {
		List<String> lines = readLines();
		int[][] grid = new int[lines.size()][];
		int i = 0;
		for (String line : lines) {
			grid[i] = parseNumbers(line);
			++i;
		}
		return grid;
	}

        private static List<String> readLines() {
                Scanner sc = new Scanner(System.in);
                List<String> lines = new ArrayList<>();
                while (true)
                        if (sc.hasNext()) {
                                String line = sc.nextLine();
                                if (line.equals("end"))
                                        return lines;
                                if (!line.isEmpty())
                                        lines.add(line);
                        }
        }

	private static int[] parseNumbers(String text) {
		List<Integer> numbers = new ArrayList<>();
		Scanner sc = new Scanner(text);
		while(sc.hasNext())
			numbers.add(sc.nextInt());
		int[] ints = new int[numbers.size()];
		for (int i = 0; i < ints.length; ++i)
			ints[i] = numbers.get(i);
		return ints;
	}
}
