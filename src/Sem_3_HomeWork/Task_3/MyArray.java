package Sem_3_HomeWork.Task_3;

class MyArray<T extends Number> {
    private T[] value;

    protected MyArray(T[] value) {
        this.value = value;
    }

    public T[]  getValue() {
        return value;
    }
}
