/**
 * A class holding the firstName, lastName, phone, and email of an ExtraCurricular's Reference
 *
 * @author Andrew Zhang
 * @version 1.0
 * @since 1.8
 */

public class Reference {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    /**
     * This is the constructor method for references of new extracurricular activities
     *
     * @param firstName - This is the first name of the reference
     * @param lastName - This is the last name of the reference
     * @param phone - This is the phone number of the reference
     * @param email - This is the email address of the reference
     */
    public Reference(String firstName, String lastName, String phone, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    /**
     * This method converts the hash code of the object into a string representation
     *
     * @return The string representation of the object
     */
    @Override
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + ", Contact: " + this.phone + ", " + this.email;
    }

    /**
     * Setter for firstName field
     *
     * @param firstName This is the first name of the object
     */

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * Getter for firstName field
     *
     * @return the first name of the reference as a String
     */

    public String getFirstName(){
        return firstName;
    }

    /**
     * Setter for lastName field
     *
     * @param lastName This is the last name of the reference
     */

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * Getter for lastName field
     *
     * @return the last name of the reference as a String
     */

    public String getLastName(){
        return lastName;
    }

    /**
     * Setter for phone field
     *
     * @param phone This is the phone number of the reference
     */

    public void setPhone(String phone){
        this.phone = phone;
    }

    /**
     * Getter for phone field
     *
     * @return the phone number of the reference as a String
     */

    public String getPhone(){
        return phone;
    }

    /**
     * Setter for email field
     *
     * @param email This is the email address of the reference
     */

    public void setEmail(String email){
        this.email = email;
    }

    /**
     * Getter for email field
     *
     * @return the email address of the reference as a String
     */

    public String getEmail(){
        return email;
    }
}
