import java.util.Arrays;

/**
 * A subclass inherited from parent class ExtracurricularActivity
 *
 * @author Andrew Zhang
 * @version 1.0
 * @since 1.8
 */

public class Club extends ExtracurricularActivity {
    private int startDate;
    private int endDate;
    private int hoursWeekly;
    /**
     * This is the constructor method for new extacurricular activities
     *
     * @param name - This is the name of the extracurricular activity
     * @param type - This is the type of extracurricular activity
     * @param level - This is the level of the extracurricular activity
     * @param reference - This is the reference of the extracurricular activity
     * @param startDate - This is the startDate of the extracurricular activity (YYYYMMDD)
     * @param endDate - This is the endDate of the extracurricular activity (YYYYMMDD)
     * @param hoursWeekly - This is the hoursWeekly of the extracurricular activity
     */
    public Club(String name, String type, String level, Reference reference, int startDate, int endDate, int hoursWeekly) {
        super(name, type, level, reference);
        this.startDate = startDate;
        this.endDate = endDate;
        this.hoursWeekly = hoursWeekly;
    }

    /**
     * Setter for startDate field
     *
     * @param startDate This is the start date of the club
     */

    public void setStartDate(int startDate){
        this.startDate = startDate;
    }

    /**
     * Getter for startDate field
     *
     * @return the start date of the club as an int
     */

    public int getStartDate(){
        return startDate;
    }

    /**
     * Setter for endDate field
     *
     * @param endDate This is the end date of the club
     */

    public void setEndDate(int endDate){
        this.endDate = endDate;
    }

    /**
     * Getter for endDate field
     *
     * @return the end date of the club as an int
     */

    public int getEndDate(){
        return endDate;
    }

    /**
     * Setter for hoursWeekly field
     *
     * @param hoursWeekly This is the hours weekly spent on the club
     */

    public void setHoursWeekly(int hoursWeekly){
        this.hoursWeekly = hoursWeekly;
    }

    /**
     * Getter for hoursWeekly field
     *
     * @return the hoursWeekly of the club as an int
     */

    public int getHoursWeekly(){
        return hoursWeekly;
    }

    /**
     * This method converts classname@HashCode_in_Hexidecimal_form into a string representation
     *
     * @return The string representation of the object
     */
    @Override
    public String toString(){
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int startDay,startMonth,startYear, endDay, endMonth, endYear;
        startDay = startDate%100;
        startMonth = (startDate%10000-startDay)/100;
        startYear = (startDate%100000000-startMonth*100-startDay)/10000;
        endDay = endDate%100;
        endMonth = (endDate%10000-endDay)/100;
        endYear = (endDate%100000000-endMonth*100-endDay)/10000;
        return "Name: " + name +
                "\nType: " + type +
                "\nLevel: " + level +
                "\nStart Date: " + months[endMonth-1] + " " + endDay + ", " + endYear +
                "\nEnd Date: " + months[startMonth-1] + " " + startDay + ", " + startYear +
                "\nReference - " + reference;
    }
}
