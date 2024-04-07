package Sem_3_HomeWork.Task_1;

/*
Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
 */



public class App {
    public static void main(String[] args) {
        Person[] persons = {new Worker(), new Idle(), new Worker(), new Worker()};
        Workplace<Person> workplace = new Workplace<>(persons);
        Club<Person> club = new Club<>(persons);
        System.out.println("= Workplace =");
        workplace.start();
        System.out.println("= Club =");
        club.start();


        // ==== Собственно работа итераторов коллекций workplace и club ==== //
        System.out.println();
        System.out.println("Iterator (Workplace) work:");
        System.out.println("-".repeat(40));
        while (workplace.iterator.hasNext()) {
            System.out.println("Персонаж #" + (workplace.iterator.getCurrentIndex() + 1) + ":  "
                    + workplace.iterator.next().getClass().getSimpleName());
        }
        System.out.println("-".repeat(40));


        System.out.println();
        System.out.println("Iterator (Club) work:");
        System.out.println("-".repeat(40));
        while (club.iterator.hasNext()) {
            System.out.println("Персонаж #" + (club.iterator.getCurrentIndex() + 1) + ":  "
                    + club.iterator.next().getClass().getSimpleName());
        }
        System.out.println("-".repeat(40));
    }
}
