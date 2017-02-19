package home_work.homework_week2;

/**
 * 8 При поступлении в вуз абитуриенты, получившие "двойку" на первом экзамене,
 * ко второму не допускаются. В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
 * Подсчитать, сколько человек не допущено ко второму экзамену.
 */
public class Task_8 {
    public static void main(String[] args) {
        int[] marks = {2,5,3,4,5,2,4,2,3,5,2,2};
        System.out.println(badMarks(marks));
    }

    public static int badMarks (int[] marks) {
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == 2) {
                count++;
            }
        }
        return count;

    }}

