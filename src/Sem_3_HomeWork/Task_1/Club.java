package Sem_3_HomeWork.Task_1;

import java.util.*;

public class Club<T extends Person> {
    T[] arrayT;
    MyCollectionIterator<T> iterator;

    public Club(T[] arrayT) {
        this.arrayT = arrayT;
        this.iterator = new MyCollectionIterator<>(this.arrayT);
    }

    public void start() {
        for (int i = 0; i < arrayT.length; i++) {
            System.out.print("Персонаж " + (i+1) + ": " + arrayT[i].getClass().getSimpleName() + ". ");
            System.out.print("Расслабься, чувак!  - ");
            arrayT[i].haveRest();
        }
    }
    public class MyCollectionIterator<T> {
        private T[] array;
        private int currentIndex = 0;

        public MyCollectionIterator(T[] array) {
            this.array = array;
        }

        public boolean hasNext() {
            if ( currentIndex < array.length ) {
                return true;
            }
            return false;
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            return (T) array[currentIndex++];
        }

        public int getCurrentIndex() {
            return currentIndex;
        }
    }
}
