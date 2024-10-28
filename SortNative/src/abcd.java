
public class abcd {
	private int a, b, c, d;

	public abcd(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public void sumOfNumbers() {
		int sum = a + b + c + d;
		System.out.println("Sum = " + sum);
	}

	public void findMax() {
		if (a >= b && a >= c && a >= d) {
			System.out.println("Max = " + a);
		} else if (b >= a && b >= c && b >= d) {
			System.out.println("Max = " + b);
		} else if (c >= a && c >= b && c >= d) {
			System.out.println("Max = " + c);
		} else {
			System.out.println("Max = " + d);
		}
	}

	public void findMin() {
		if (a <= b && a <= c && a <= d) {
			System.out.println("Min = " + a);
		} else if (b <= a && b <= c && b <= d) {
			System.out.println("Min = " + b);
		} else if (c <= a && c <= b && c <= d) {
			System.out.println("Min = " + c);
		} else {
			System.out.println("Min = " + d);
		}
	}

	public int findMax2() {
		int max2 = a;
		if (b >= a && b >= c && b >= d) {
			max2 = b;
		} else if (c >= a && c >= b && c >= d) {
			max2 = c;
		} else {
			max2 = d;
		}

		return max2;
	}

	public void sumOfCharNums() {
		int sumA = getSumOfCharNum(a);
		int sumB = getSumOfCharNum(b);
		int sumC = getSumOfCharNum(c);
		int sumD = getSumOfCharNum(d);

		System.out.println("Tổng các chữ số là " + a + " = " + sumA);
		System.out.println("Tổng các chữ số là " + b + " = " + sumB);
		System.out.println("Tổng các chữ số là " + c + " = " + sumC);
		System.out.println("Tổng các chữ số là " + d + " = " + sumD);

	}

	private int getSumOfCharNum(int a2) {
		if (a2 < 10000 || a2 > 99999) { // || : Hoặc, && : Và
			return 0;
		}
		// 12345
		int chuSo1 = a2 % 10; // 5
		a2 = a2 / 10; // 1234

		int chuSo2 = a2 % 10; // 4
		a2 = a2 / 10; // 123

		int chuSo3 = a2 % 10; // 3
		a2 = a2 / 10; // 12

		int chuSo4 = a2 % 10; // 2
		a2 = a2 / 10; // 1

		int chuSo5 = a2 % 10; // 1
		return chuSo1 + chuSo2 + chuSo3 + chuSo4 + chuSo5;
	}

	// Đệ quy
	public int tinhTongChuSo2(int random) {
		if (random == 0) {
			return 0;
		}
		int chuSo = random % 10;
		random = random / 10;

		// Lời gọi lại chính hành vi nhưng số đã bị cắt chữ số cuối
		return chuSo + tinhTongChuSo2(random);

	}

	public void sumOfCharNums2() {
		int sumA = tinhTongChuSo2(a);
		int sumB = tinhTongChuSo2(b);
		int sumC = tinhTongChuSo2(c);
		int sumD = tinhTongChuSo2(d);

		System.out.println("Tổng các chữ số là " + a + " = " + sumA);
		System.out.println("Tổng các chữ số là " + b + " = " + sumB);
		System.out.println("Tổng các chữ số là " + c + " = " + sumC);
		System.out.println("Tổng các chữ số là " + d + " = " + sumD);
	}

	public void findCharNumMax() {
		int maxA = tinhChuSoLonNhatTungSo(a, 0);
		int maxB = tinhChuSoLonNhatTungSo(b, 0);
		int maxC = tinhChuSoLonNhatTungSo(c, 0);
		int maxD = tinhChuSoLonNhatTungSo(d, 0);

		System.out.println("Max char number " + a + " = " + maxA);
		System.out.println("Max char number " + b + " = " + maxB);
		System.out.println("Max char number " + c + " = " + maxC);
		System.out.println("Max char number " + d + " = " + maxD);
	}

	private int tinhChuSoLonNhatTungSo(int number, int max) { // 12345 và 0
		if (number == 0) {
			return max;
		}
		int chuSo = number % 10; // chuSo = 5
		number = number / 10; // num 1234
		if (max > chuSo) { // 0 < 5
			return tinhChuSoLonNhatTungSo(number, max);
		}
		return tinhChuSoLonNhatTungSo(number, chuSo); // num 1234 và chuSo 5
	}

	public void sapXepNhoDenLonVaLonDenBe() {
		int soThu1 = timSoNhoNhat();
		int soThu2 = timSoNhoNhat();
		int soThu3 = timSoNhoNhat();
		int soThu4 = timSoNhoNhat();
		int soThu5 = timSoNhoNhat();

		System.out.println("Các số từ bé đến lớn: ");
		System.out.println(soThu1 + " < " + soThu2 + " < " + soThu3 + " < " + soThu4 + " < " + soThu5);

		System.out.println();
		System.out.println("Các số từ lớn đến bé: ");
		System.out.println(soThu5 + " > " + soThu4 + " > " + soThu3 + " > " + soThu2 + " > " + soThu1);
	}

	private int timSoNhoNhat() {
		int min = 0;
		if (a <= b && a <= c && a <= d) {
			min = a;
			a = a + b + c + d;
		} else if (b <= c && b <= a && b <= d) {
			min = b;
			b = a + b + c + d;
		} else if (c <= a && c <= b && c <= d) {
			min = c;
			c = a + b + c + d;
		} else {
			min = d;
			d = a + b + c + d;
		}
		return min;
	}
}
