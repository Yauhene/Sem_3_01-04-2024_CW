package Sem_3_HomeWork.Task_4;

public class Pair <T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        Pair pair_1 = new Pair(1, "first pair");
        System.out.println(pair_1.getFirst());
        System.out.println(pair_1.getSecond());

        System.out.println();

        Pair pair_2 = new Pair(2, "second pair");
        System.out.println(pair_2.getFirst());
        System.out.println(pair_2.getSecond());
    }
}
