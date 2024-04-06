

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        FileInputStream fis;
//        Box<String, Integer, FileInputStream> box1;
//
//        try {
//            fis = new FileInputStream("src/file.txt");
//            box1 = new Box<>("Word", 5, fis);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(box1.valueT);
//        System.out.println(box1.valueK);
//        System.out.println(box1.valueV);


        MyCollection<Integer> collection = new MyCollection<>();
        collection.addElement(1);
        collection.addElement(34);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        System.out.println(Arrays.toString(collection.getValue()));
        collection.deleteElement(34);

        System.out.println(Arrays.toString(collection.getValue()));

        collection.deleteElement(66);
        System.out.println(Arrays.toString(collection.getValue()));
        MyCollectionIterator<Object> myCollectionIterator = new MyCollectionIterator<>(collection.value);

        while (collection.hasNext()) {
            System.out.println(collection.next());
        }


    }
}
