package task_2;

public class ClassRoom {
    Pupil [] pupils;
    ClassRoom (Pupil [] pupils) {
        this.pupils = pupils;
    }

    public void show (Pupil [] pupil){
        for (Pupil pupils : pupil) {
            System.out.println();
            System.out.println("ЭТОТ СТУДЕНТ: ");
            pupils. study();
            pupils.read();
            pupils.write();
            pupils.relax();
        }
    }
}
