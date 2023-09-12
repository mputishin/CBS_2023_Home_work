package cbs.dp.ua.Generic_9_2;

public class Main {
    public static void main(String[] args) {

        MyOwnList<Integer> list1 = new MyOwnList<>();

        list1.addElement(52);
        list1.addElement(34);
        list1.addElement(13);
        list1.addElement(21);
        list1.addElement(11);
        list1.addElement(19);
        list1.showAllElement();

        list1.showElement(3);

        MyOwnList<String> list2 = new MyOwnList<>();

        list2.addElement("Hello");
        list2.addElement("World");
        list2.addElement("Hi");
        list2.addElement("Everyone");

        list2.showAllElement();
        list2.showElement(2);
    }
}
