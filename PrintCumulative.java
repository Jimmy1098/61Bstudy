package print_intengers;

public class PrintCumulative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int result = 0;
		while (x < 10) {
			result += x;
			System.out.print(result + " ");
			x += 1;
		}
	}

}
