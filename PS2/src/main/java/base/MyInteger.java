package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	// Methods with no parameters
	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime() {
		for (int i = 2; i < iValue; i++) {
			if (iValue % i == 0)
				return false;
		}
		return true;
	}

	// Static Methods
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	// Static Methods with MyInteger

	public static boolean isEven(MyInteger input) {
		int value = input.getiValue();
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger input) {
		int value = input.getiValue();
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(MyInteger input) {
		int value = input.getiValue();
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Compare Methods

	public boolean equals(int input) {
		if (input == iValue) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(MyInteger input) {
		if (input.getiValue() == getiValue()) {
			return true;
		} else {
			return false;
		}
	}
}
