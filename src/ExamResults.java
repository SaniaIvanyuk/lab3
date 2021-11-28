import java.util.ArrayList;
import  java.util.Collections;

public class ExamResults {

    public static final int MARK_COUNT = 5;
    ArrayList<ExamResult> examResults;
    final String[] discipline = {"Английский", "Математика", "Программирование", "Физика", "Химия"};

    public ExamResults() {
        this.examResults = new ArrayList<>();
    }

    void add(ExamResult examRes) {
        examResults.add(examRes);
    }

    public void IsExcellent() {
        boolean Check = false;
        for (ExamResult object : examResults) {
            for (int i = 0; i < MARK_COUNT; i++) {
                if (object.result[i].getMark() > 3) {
                    Check = true;
                } else {
                    Check = false;
                    break;
                }
            }
            if (Check == true) {
                System.out.println(object);
            }
        }
    }

    public void IsBadStudent() {
        boolean Check = false;
        for (ExamResult object : examResults) {
            for (int i = 0; i < MARK_COUNT; i++) {
                if (object.result[i].getMark() == 2) {
                    Check = true;
                    break;
                } else {
                    Check = false;
                }
            }
            if (Check == true) {
                System.out.println(object);
            }
        }
    }

    public void RemoveBadStudents() {
        boolean flag = false;
        for (ExamResult object : examResults) {
            for (int i = 0; i < MARK_COUNT; i++) {
                if (object.result[i].getMark() == 2) {
                    examResults.remove(object);
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }
    }

    int countFirstSubject = 0;
    int countSecondSubject = 0;
    int countThirdSubject = 0;
    int countFourthSubject = 0;
    int countFifthSubject = 0;

    public void SubjectWithBadMark() {
        for (ExamResult object : examResults) {
            for (int i = 0; i < MARK_COUNT; i++) {
                if (object.result[i].getSubjectName().equals(discipline[0]) && object.result[i].getMark() == 2) {
                    countFirstSubject++;
                }
                if (object.result[i].getSubjectName().equals(discipline[1]) && object.result[i].getMark() == 2) {
                    countSecondSubject++;
                }
                if (object.result[i].getSubjectName().equals(discipline[2]) && object.result[i].getMark() == 2) {
                    countThirdSubject++;
                }
                if (object.result[i].getSubjectName().equals(discipline[3]) && object.result[i].getMark() == 2) {
                    countFourthSubject++;
                }
                if (object.result[i].getSubjectName().equals(discipline[4]) && object.result[i].getMark() == 2) {
                    countFifthSubject++;
                }
            }
        }

        ArrayList<Integer> counters = new ArrayList<>();
        counters.add(countFirstSubject);
        counters.add(countSecondSubject);
        counters.add(countThirdSubject);
        counters.add(countFourthSubject);
        counters.add(countFifthSubject);

        if (countFirstSubject == Collections.max(counters)){
            System.out.println(discipline[0] + " - " + countFirstSubject);
        }
        if (countSecondSubject == Collections.max(counters)){
            System.out.println(discipline[1] + " - " + countSecondSubject);
        }
        if (countThirdSubject == Collections.max(counters)){
            System.out.println(discipline[2] + " - " + countThirdSubject);
        }
        if (countFourthSubject == Collections.max(counters)){
            System.out.println(discipline[3] + " - " + countFourthSubject);
        }
        if (countFifthSubject == Collections.max(counters)){
            System.out.println(discipline[4] + " - " + countFifthSubject);
        }
    }

    @Override
    public String toString() {
        return "ExamResults{" +
                examResults +
                '}';
    }
}