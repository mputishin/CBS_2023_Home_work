package cbs.dp.ua.lesson_3_2;

public class ClassRoom {

    Pupil [] pupils;

    ClassRoom (Pupil[] pupils) {
        this.pupils = pupils;
    }

    void showClassRoom (Pupil[] pupil) {
        for (Pupil pupils : pupil) {
            System.out.println(" This student is: ");
            pupils.study();
            pupils.read();
            pupils.write();
            pupils.relax();
        }
    }
}
