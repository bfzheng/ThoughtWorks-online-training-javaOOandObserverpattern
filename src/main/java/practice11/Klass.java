package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Klass extends Observable {
    private int number;
    private Student leader;
    private boolean isInthisKlass;

    public Klass(int i) {
        number = i;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + String.valueOf(number);
    }

    public void assignLeader(Student jerry) {
        if (jerry.getKlass().isInthisKlass == true) {
            leader = jerry;
        } else {
            System.out.print("It is not one of us.\n");
        }
        setChanged();
        notifyObservers();
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student jerry) {
        jerry.getKlass().isInthisKlass = true;
        setChanged();
        notifyObservers();
    }

    public boolean isIn(Student student) {
        return this==student.getKlass();
    }
}
