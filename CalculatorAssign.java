package week1.day2;

public class CalculatorAssign {
		
		public int add(int num1, int num2, int num3) {
			return num1 + num2+ num3;
		}

		public int sub(int a1, int b1) {
			return a1 - b1;
		}

		public double multiply(double x, double y) {
			return x * y;
		}

		public float divide(float a, float b) {
			return a / b;
		}

		public static void main(String[] args) {
			CalculatorAssign myCalculator = new CalculatorAssign();
			System.out.println("Addition:" + myCalculator.add(2, 5,8));
			System.out.println("Subtraction:" + myCalculator.sub(66, 36));
			System.out.println("Multiply:" + myCalculator.multiply(5, 10));
			System.out.println("Divide:" + myCalculator.divide(55f, 11f));

		}


	}


