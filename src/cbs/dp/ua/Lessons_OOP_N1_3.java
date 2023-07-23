package cbs.dp.ua;

public class Lessons_OOP_N1_3 {
    public static void main(String[] args) {

        Computer [] comp = new Computer[5];

        Computer comp1 = new Computer();
        Computer comp2 = new Computer();
        Computer comp3 = new Computer();
        Computer comp4 = new Computer();
        Computer comp5 = new Computer();

        for (int i=0; i<5; i++) {
            if (comp [i]== comp[0]) {
            comp[i] = comp1;
            } else if (comp [i]== comp[1]) {
                comp[i] = comp2;
            } else if (comp [i]== comp[2]) {
                comp[i] = comp3;
            } else if (comp [i]== comp[3]) {
                comp[i] = comp4;
            } else if (comp [i]== comp[4]) {
                comp[i] = comp5;
            }
            System.out.println(comp[i]);
        }
    }
}

class Computer{

}