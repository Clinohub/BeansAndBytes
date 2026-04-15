import java.math.BigDecimal;

public class SimpleInterestCalculator {

	private BigDecimal principal;
	private BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(String noOfYears) {
		BigDecimal totalValue = principal.add(
			principal.multiply(interest)
			.multiply(new BigDecimal(noOfYears))
		);
		return totalValue;
	}

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("1500.00", "6.5");
		BigDecimal totalSavings = calculator.calculateTotalValue("0.0833");
		System.out.println(totalSavings);
	}
}
