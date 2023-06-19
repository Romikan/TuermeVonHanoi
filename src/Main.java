public class Main {
    public static void main(String[] args) {

        initTower(4,1,2,3);
        shuffleTower(4, 1,2,3);
    }
    static int counter = 0;
    private static void showTower() {
        System.out.println( "shuffleTower( "+ counter + ", " + N + ", " + src + ", " + tmp + ", " + dst + ")");
    }
    private static void initTower(int N, int src, int tmp, int dst) {

        System.out.println( "shuffleTower(Zähler, Höhe, Quelle, Ablage, Ziel )");
        System.out.println( "------------------------------------------");

    }
    private static void shuffleTower(int N, int src, int tmp, int dst) {
        counter++;
        System.out.println( "shuffleTower( "+ counter + ", " + N + ", " + src + ", " + tmp + ", " + dst + ")");
        if (N == 1) {
            System.out.println("Move from " + src + " to " + dst);

        } else {

            shuffleTower(N - 1, src, dst, tmp);
            System.out.println("Move from " + src + " to " + dst);

            shuffleTower(N - 1, tmp, src, dst);
        }
    }
}