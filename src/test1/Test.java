package test1;
import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;

public class Test {
	@Requires("x >= 0.0")
	@Ensures({ "result >= 0.0", "Math.abs(result * result - x) < 0.001" })
	public static double sqrt(double x) {
	return Math.sqrt(x);
	}
	public static void main(String[] args) {
	// pre-condition OK
	double x = sqrt(100);
	System.out.println("x = " + x);
	// pre-condition FAIL
	x = sqrt(-100);
	System.out.println("x = " + x);
	}
}
