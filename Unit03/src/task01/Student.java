package task01;

public class Student {
    private String secondName;
    private int groupNumber;
    private int[] performance;

    public Student(String secondName, int groupNumber, int[] perfomance) {
        this.groupNumber = groupNumber;
        this.secondName = secondName;
        this.performance = perfomance;
    }

    public String getName() {
        return secondName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getPerformance() {
        return performance;
    }

    public boolean isExcellentStudent(int[] assessments) {
        for (int i = 0; i < assessments.length; i++) {
            if (assessments[i] < 9) {
                return false;
            }
        }
        return true;
    }
}
