public class WhileNumberPlayer {

    private int limit;

    public WhileNumberPlayer(int limit) {
        this.limit = limit;
    }

    void printSquaresUptoLimit() {
        int i = 1;
        int squareI = i*i;
        while (squareI <= limit) {
            System.out.print(squareI + " ");
            i++;
            squareI = i*i;
        }
    }

    void printCubesUptoLimit() {
        int j = 1;
        int cubeJ = j*j*j;
        while (cubeJ <= limit) {
            System.out.print(cubeJ + " ");
            j++;
            cubeJ = j*j*j;
        }
    }

    public static void main(String[] args) {
        WhileNumberPlayer player = new WhileNumberPlayer(30);

        player.printSquaresUptoLimit();
        System.out.println();

        player.printCubesUptoLimit();
        System.out.println();
    }
} 
