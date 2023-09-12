package cbs.dp.ua.Generic_9_2;

public class MyOwnList<T> {

    Object[] elements;
    int cell;
    int count;

    public MyOwnList() {
        this.count = 0;
        this.cell = 10;
        this.elements = new Object[cell];
    }

    public void countCell() {
        count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                count++;
            }
        }
    }

    public void addElement (T element ) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = element;
                break;
            }
        }
        countCell();
    }

    public void showAllElement() {
        for (int i = 0; i < count; i++) {
            System.out.println(elements[i]);
        }
        System.out.println("Количество элементов в массиве: " + count);
    }

    public void showElement (int index) {
        System.out.println("По индексу " + index + " находится элемент: " + elements[index]);
    }
}
