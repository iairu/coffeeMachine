import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger dfact = BigInteger.ONE;
        for (int i = n; i > 1; i -= 2) {
            dfact = dfact.multiply(BigInteger.valueOf(i));
        }
        return dfact;
    }
}
