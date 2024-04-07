package PersonTask;

public class Club<T extends Person> {
    T[] arrayT;

    public Club(T[] arrayT) {
        this.arrayT = arrayT;
    }

    public void start() {
        for (int i = 0; i < arrayT.length; i++) {
            System.out.print("Персонаж " + (i+1) + ": " + arrayT[i].getClass().getSimpleName() + ". ");
            System.out.print("Расслабься, чувак!  - ");
            arrayT[i].haveRest();
        }
    }
}
