package PersonTask;

public class Workplace<T extends Person> {
    T[] arrayT;

    public Workplace(T[] arrayT) {
        this.arrayT = arrayT;
    }

    public void start() {
        for (int i = 0; i < arrayT.length; i++) {
            System.out.print("Персонаж " + (i + 1) + ": " + arrayT[i].getClass().getSimpleName() + ". ");
            System.out.print("Арбайтн! Солнце еще высоко!  - ");
            arrayT[i].doWork();
        }
    }
}
