public class Main {

    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        hanoi.hanoi(3, 'A', 'B', 'C');
        System.out.println("Completed in " + hanoi.getStep() + " steps.");
    }

}
 