package myAttendance;

import java.util.Scanner;

class Ans {
    private float ans = 0;

    float calAttendance(int attended, int totalClass) {

        ans = (((float) attended / totalClass) * 100);
        return ans;
    }

    float getcalAttendance() {
        return ans;
    }
}

class StudentAttendance extends Ans {
    void checkValues(int attended, int totalClass) {
        if (attended > totalClass) {
            System.out.println("Enter correct values!");
        } else {
            System.out.println("Your attendance is : " + calAttendance(attended, totalClass) + " %");
        }
    }

}

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentAttendance s1 = new StudentAttendance();

        System.out.println("Attended classes : ");
        int attended = sc.nextInt();
        System.out.println("Total number of classes : ");
        int totalClass = sc.nextInt();

        s1.checkValues(attended, totalClass);
        sc.close();
    }
}
