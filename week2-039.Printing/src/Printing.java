public class Printing {

    public static void printStars(int amount) {
        int a = 0;
        while (a<amount){
            System.out.print("*");
            a++;
        }
        System.out.print("\n");
    }

    public static void printSquare(int sideSize) {
        int a = 0;
        while (a<sideSize){
            printStars(sideSize);
            a++;
        }
    }

    public static void printRectangle(int width, int height) {
        int a = 0;
        while(a<height){
            printStars(width);
            a++;
        }
    }

    public static void printTriangle(int size) {
        int a = 1;
        while(a<=size){
            printStars(a);
            a++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
