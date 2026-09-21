public class FinalExam extends GradedActivity{

    /* Define fields/attributes */
    private int numQuestions;
    private int numMissed;

    /* Create a final exam with a set amount of questions and wrong answers */
    public FinalExam(int questions, int missed){
        numQuestions = questions;
        numMissed = missed;
    }

    /* Return the amount of questions */
    public int getQuestions(){
        return numQuestions;
    }

    /* Return the amount of questions missed */
    public int getNumMissed(){
        return numMissed;
    }

    /* Return the amount of points earned */
    public double getPointsEach(){
        double points = numQuestions-numMissed;
        return points;
    }
    /*()__() NEW CHANGE */
}
