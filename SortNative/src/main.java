
public class main {
	public static void main(String[] args) {
		abcd s = new abcd(19, 112, 1311, 13112006);
		s.sumOfNumbers();
		s.findMax();
		s.findMin();

		int max = s.findMax2();
		System.out.println("max = " + max);

		System.out.println();

		System.out.println("Tính tổng 5 chữ số!");
		s.sumOfCharNums();

		System.out.println();
		System.out.println("Tính tổng số random!");
		s.sumOfCharNums2();

		System.out.println();
		s.findCharNumMax();

		System.out.println();
		s.sapXepNhoDenLonVaLonDenBe();
	}
}
