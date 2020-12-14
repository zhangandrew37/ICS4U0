import java.util.Arrays;

/**
 * A subclass inherited from parent class ExtracurricularActivity
 *
 * @author Andrew Zhang
 * @version 1.0
 * @since 1.8
 */

public class Award extends ExtracurricularActivity {
    private String outcome;
    private int dateAwarded;
    private boolean eligibleForScholarship;
    /**
     * This is the constructor method for new extacurricular activities
     *
     * @param name - This is the name of the extracurricular activity
     * @param type - This is the type of extracurricular activity
     * @param level - This is the level of the extracurricular activity
     * @param reference - This is the reference of the extracurricular activity
     * @param outcome - This is the outcome of the extracurricular activity
     * @param dateAwarded - This is the date of the extracurricular activity (YYYYMMDD)
     * @param eligibleForScholarship - This indicates if the award is eligible for a scholarship
     */
    public Award(String name, String type, String level, Reference reference, String outcome, int dateAwarded, boolean eligibleForScholarship) {
        super(name, type, level, reference);
        this.outcome = outcome;
        this.dateAwarded = dateAwarded;
        this.eligibleForScholarship = eligibleForScholarship;
    }

    /**
     * Setter for outcome field
     *
     * @param outcome This is the outcome of the award
     */

    public void setOutcome(String outcome){
        this.outcome = outcome;
    }

    /**
     * Getter for outcome field
     *
     * @return the outcome of the award as a String
     */

    public String getOutcome(){
        return outcome;
    }

    /**
     * Setter for dateAwarded field
     *
     * @param dateAwarded This is the date awarded of the award
     */

    public void setDateAwarded(int dateAwarded){
        this.dateAwarded = dateAwarded;
    }

    /**
     * Getter for dateAwarded field
     *
     * @return the dateAwarded as an int
     */

    public int getDateAwarded(){
        return dateAwarded;
    }

    /**
     * Setter for eligibleForScholarship field
     *
     * @param eligibleForScholarship This indicates if the award is eligible for a scholarship
     */

    public void setEligibleForScholarship(boolean eligibleForScholarship){
        this.eligibleForScholarship = eligibleForScholarship;
    }

    /**
     * Getter for eligibleForScholarship field
     *
     * @return the eligibility for scholarship as a boolean
     */

    public boolean isEligibleForScholarship(){
        return eligibleForScholarship;
    }

    /**
     * This method converts classname@HashCode_in_Hexidecimal_form into a string representation
     *
     * @return the string representation of the object
     */
    @Override
    public String toString(){
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int day,month,year;
        day = dateAwarded%100;
        month = (dateAwarded%10000-day)/100;
        year = (dateAwarded%100000000-month*100-day)/10000;
        return "Name: " + name +
               "\nType: " + type +
               "\nLevel: " + level +
               "\nOutcome: " + outcome +
               "\nDate Awarded: " + months[month-1] + " " + day + ", " + year +
               "\nEligible for Scholarship: " + eligibleForScholarship +
               "\nReference - " + reference;
    }

}
