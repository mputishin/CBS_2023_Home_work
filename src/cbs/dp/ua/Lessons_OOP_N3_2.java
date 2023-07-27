package cbs.dp.ua;

public class Lessons_OOP_N3_2 {
    public static void main(String[] args) {

        Pupil [] pupils = {new GoodPupil(), new ExcelentPupil(), new GoodPupil(), new BadPupil()};
        ClassRoom cls = new ClassRoom(pupils);

        cls.showClassRoom(cls.pupils);
    }
}
