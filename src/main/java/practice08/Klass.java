package practice08;

public class Klass {
    private int number;
    private Student leader;

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
        leader = jerry;
    }

    public Student getLeader() {
        return leader;
    }
}
