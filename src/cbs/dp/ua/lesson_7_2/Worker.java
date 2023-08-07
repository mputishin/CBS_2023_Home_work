package cbs.dp.ua.lesson_7_2;

import java.util.Arrays;
import java.util.Scanner;

public class Worker {

    private String fio;
    private String posada;
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    public String getFio() {
        return fio;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "FIO worker: " + getFio() + "  since year: " + getYear();
    }


    public Worker (String fio, String posada, int year) {
        this.fio = fio;
        this.posada = posada;
        this.year = year;
    }

    public static Worker[] sort (Worker[] workers) {              //Метод алфавитной сртировки
        Worker[] sortworkers = new Worker[workers.length];
        String[] fio = new String[workers.length];
        for (int i = 0; i < workers.length; i++) {
            fio[i] = workers[i].getFio();
        }

        Arrays.sort(fio);

        for (int i = 0; i < workers.length; i++) {
            for (int j = 0; j < workers.length; j++) {
                if (fio[i].equals(workers[j].getFio())) {
                    sortworkers[i] = workers[j];
                }
            }
        }
        return sortworkers;
    }

    public static void yearAdedd (Worker[] sortworkers){          //Метод установки года принятия на работу
        Scanner scn = new Scanner(System.in);
        for (Worker worker : sortworkers) {
            System.out.println("Enter the year adedd this " + worker.getFio() + " worker:");
            try {                                                  // Генерация исключения при вводе неверного года
                int year = scn.nextInt();
                if (year < 1986 || year > 2005) {
                    if (year < 1986) worker.setYear(1986);
                    else if (year > 2005) worker.setYear(2005);
                    throw new Exception ("This year isn't valid for " + worker.getFio());
                }
                worker.setYear(year);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            System.out.println(worker.toString());
            System.out.println("-----------------------");
        }
    }
}

