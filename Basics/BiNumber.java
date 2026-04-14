public class BiNumber {

    private int a;
    private int b;

    public BiNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public long add() {
        return a + b;
    }

    public long multiply() {
        return a * b;
    }

    public static void main(String[] args) {
        BiNumber numbers = new BiNumber(2,3);
        System.out.println(numbers.add());
        System.out.println(numbers.multiply());
}

} 

