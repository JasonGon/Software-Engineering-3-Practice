public class GradedActivity {

    /* Define fields/attributes */
    private double score;

    /* Create a graded activity*/
    public GradedActivity(){
    }

    /* Set a score */
    public void setScore(double s){
        score = s;
    }

    /* View a score */
    public double getScore(){
        return score;
    }

    /* Return a letter grade */
    public char getGrade(){
        if(score >= 90){
            return 'A';
        }
        else if(score >= 80){
            return 'B';
        }
        else if(score >= 70){
            return 'C';
        }
        else if(score >= 60){
            return 'D';
        }
        return 'F';
    }
}
