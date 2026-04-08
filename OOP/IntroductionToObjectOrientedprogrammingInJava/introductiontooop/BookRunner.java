package introductiontooop;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.setNumberOfCopies(32);
		effectiveJava.setNumberOfCopies(100);
		cleanCode.setNumberOfCopies(45);

		System.out.println(artOfComputerProgramming.getNumberOfCopies());
		System.out.println(effectiveJava.getNumberOfCopies());
		System.out.println(cleanCode.getNumberOfCopies());

	}

}
