public class Main {
    public static void main(String[] args) {

        initTower(4,1,2,3);
        int counter = shuffleTower(4, 1,2,3);
        System.out.println("Moves: " + counter);
    }

    static int counter = 0;
    private static int getMoves() {
        return 0;
    }
    private static void showTower() {
    }
    private static void initTower(int N, int src, int tmp, int dst) {

        Turm turm;
        //turm = new Turm();
        //turm.N = N;
        //turm.src = src;
        //turm.dst = dst;
        final Turm source = new Turm("A");
        final Turm template = new Turm("B");
        final Turm destination = new Turm("C");




        System.out.println( "shuffleTower(Zähler, Höhe, Quelle, Ablage, Ziel )");
        System.out.println( "------------------------------------------");
    }
    private static int shuffleTower(int N, int src, int tmp, int dst) {
        counter++;
        System.out.println( "shuffleTower( "+ counter + ", " + N + ", " + src + ", " + tmp + ", " + dst + ")");
        if (N == 1) {
            System.out.println("Move from " + src + " to " + dst);

        } else {

            shuffleTower(N - 1, src, dst, tmp);
            System.out.println("Move from " + src + " to " + dst);
            shuffleTower(N - 1, tmp, src, dst);
        }
        return counter;
    }
}