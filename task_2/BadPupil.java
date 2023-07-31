package task_2;

public class BadPupil extends Pupil{
    @Override
    public void study () { System.out.println("Study bad"); }
    @Override
    public void read (){
        System.out.println("Read bad");
    }
    @Override
    public void write (){
        System.out.println("Write bad");
    }
    @Override
    public void relax (){
        System.out.println("Relax bad");
    }
}
