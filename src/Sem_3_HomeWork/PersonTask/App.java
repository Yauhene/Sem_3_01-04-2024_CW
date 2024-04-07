package Sem_3_HomeWork.PersonTask;

/*Описать интерфейс Person с методами doWork() и haveRest().
Написать два класса работник и бездельник, реализующих интерфейс.
Работник работает, и не умеет бездельничать, в то время как бездельник не умеет работать, но умеет отдыхать.
Написать обобщённые классы Workplace и Club, содержащие массив из Person. В классах необходимо
вызывать у всего массива людей соответствующие методы
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
