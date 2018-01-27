public class Hanoi {
    private int step;

    public Hanoi() {
        this.step = 0;
    }

    public void hanoi(int n, char rodFrom, char middleRod, char rodDestination) {
        if(n==1) {
            step++;
            System.out.println("Plate " + n + " from " + rodFrom + " to " + rodDestination);
            return;
        }
        hanoi(n-1,rodFrom, rodDestination, middleRod);
        step++;
        System.out.println("Plate " + n + " from " + rodFrom + " to " + rodDestination);
        hanoi(n-1, middleRod, rodFrom, rodDestination);
    }

    public int getStep() {
        return step;
    }
}
