package punto4;

public class punto4 {

	public static int num;

	int getFactorial() {
	    int factorial = 1;
	    for (int i = num; i > 0; i--) {
	        factorial *= i;
	    }
	    return factorial;
	}

	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Factorial: ").append(num).append("! = ");
	    for (int i = 1; i <= num; i++) {
	        sb.append(i);
	        if (i < num) {
	            sb.append(" * ");
	        }
	    }
	    sb.append(" = ").append(getFactorial());
	    return sb.toString();
	}
}
