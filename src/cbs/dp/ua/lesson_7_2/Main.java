package cbs.dp.ua.lesson_7_2;


public class Main {
    public static void main(String[] args) throws Exception {

        int year = 0;

        Worker worker1 = new Worker("AvakovI.I.", "lowworker",year);
        Worker worker2 = new Worker("PetrovP.S.", "mediumworker",year);
        Worker worker3 = new Worker("CidorovR.V.", "highworker",year);
        Worker worker4 = new Worker("DrobotenkoW.D.", "lowworker",year);
        Worker worker5 = new Worker("SaenkoK.E.", "mediumworker",year);

        Worker[] workers = new Worker[]{worker1, worker2, worker3, worker4, worker5};

        Worker[] sortworkers = Worker.sort(workers);

        Worker.yearAdedd(sortworkers);
    }
}
