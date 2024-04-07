package Sem_3_HomeWork.Task_1;

public interface Person {
    default void doWork() {
        System.out.println("I'm working");
    }

    default void haveRest() {
        System.out.println("Do nothing");
    }
}
