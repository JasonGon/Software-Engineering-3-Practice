public class Main {
    public static void main(String[] args) {

        /* Create a final exam object */
        FinalExam myFinalExam = new FinalExam(10,1);

        /* Call methods of graded activity using FinalExam object */
        myFinalExam.setScore(99.99999);
        System.out.println(myFinalExam.getScore());
        System.out.println(myFinalExam.getGrade());
        }
    }