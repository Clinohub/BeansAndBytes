public class RGBColor {
    private int red;
    private int green;
    private int blue;

    public RGBColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }


    public void invert() { // {this} not needed with no parameter
        red = 255 - getRed();
        green = 255 - getGreen();
        blue = 255 - getBlue();
    }

    public static void main(String[] args) {
        RGBColor color = new RGBColor(100, 150, 200);
        System.out.print("Red: ");
        System.out.println(color.getRed());
        System.out.print("Green: ");
        System.out.println(color.getGreen());
        System.out.print("Blue: ");
        System.out.println(color.getBlue());

        System.out.print("\n");

        color.invert();
        color.invert();
        System.out.print("Invert Red: ");
        System.out.println(color.getRed());
        System.out.print("Invert Green: ");
        System.out.println(color.getGreen());
        System.out.print("Invert Blue: ");
        System.out.println(color.getBlue());
    }
}
