package task_2;

 public class Main {
    public static void main(String[] args) {

        Pupil [] pupils = {new BadPupil(), new GoodPupil(), new ExcelentPupil()};
        ClassRoom classRoom = new ClassRoom(pupils);

        classRoom.show(classRoom.pupils);

    }
}
