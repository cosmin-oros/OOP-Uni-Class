package CO.bench.cpu;

import CO.bench.IBenchmark;

import java.math.BigDecimal;

public class DigitsOfPi implements IBenchmark {
    private static final BigDecimal FOUR = BigDecimal.valueOf(4);
    private static final BigDecimal ONE = BigDecimal.valueOf(1);
    private static final BigDecimal ZERO = BigDecimal.valueOf(0);
    private static final int roundingMode = BigDecimal.ROUND_HALF_EVEN;

    private BigDecimal wholenumber = new BigDecimal("0");
    private int digits;

    private BigDecimal arctan(int denominator, int scale) {
        BigDecimal result, number, term;
        BigDecimal denominatorX = BigDecimal.valueOf(denominator);
        BigDecimal denominatorX2 = BigDecimal
                .valueOf(denominator * denominator);
        number = ONE.divide(denominatorX, scale, roundingMode);
        result = number;
        int i = 1;
        do {
            number = number.divide(denominatorX2, scale, roundingMode);
            int denom = 2 * i + 1; // /3, /5 , /7 , /9
            term = number
                    .divide(BigDecimal.valueOf(denom), scale, roundingMode);
            if (i % 2 != 0) { // finds the sign between terms
                result = result.subtract(term);
            } else {
                result = result.add(term);
            }
            i++;
        } while (term.compareTo(ZERO) != 0);
        return result;
    }


    @Override
    public void initialize(Object... params) {
        digits = (Integer) params[0];
        wholenumber = new BigDecimal("0");
    }

    @Override
    public void run() {


        int scale = digits + 5;
        BigDecimal arctan1_5 = arctan(5, scale);
        BigDecimal arctan1_239 = arctan(239, scale);
        BigDecimal pi = arctan1_5.multiply(FOUR).subtract(arctan1_239)
                .multiply(FOUR);
        wholenumber = pi;


    }

    @Override
    public void run(Object... params) {

    }

    public void printPi(){
        System.out.println(wholenumber.setScale(digits,BigDecimal.ROUND_HALF_UP));
    }

    @Override
    public void clean() {

    }

    @Override
    public void cancel() {

    }

    public void warmup() {

        initialize(30000);
        run();


    }
}