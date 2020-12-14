/**
 * An abstract class holding the name, type, level, and reference fields for inheriting subclasses
 *
 * @author Andrew Zhang
 * @version 1.0
 * @since 1.8
 */

public abstract class ExtracurricularActivity {
    protected String name;
    protected String type;
    protected String level;
    protected Reference reference;

    /**
     * This is the constructor method for new extracurricular activities
     *
     * @param name - This is the name of the extracurricular activity
     * @param type - This is the type of extracurricular activity
     * @param level - This is the level of the extracurricular activity
     * @param reference - This is the reference for the extracurricular activity
     */
    public ExtracurricularActivity(String name, String type, String level, Reference reference) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.reference = reference;
    }

    /**
     * Setter for name field
     *
     * @param name This is the name of the extracurricular activity
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for name field
     *
     * @return name of the extracurricular activity
     */

    public String getName() {
        return name;
    }

    /**
     * Setter for type field
     *
     * @param type This is the type of the extracurricular activity
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for type field
     *
     * @return the type of the extracurricular activity
     */

    public String getType() {
        return type;
    }

    /**
     * Setter for level field
     *
     * @param level This is the level of the extracurricular activity
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * Getter for level field
     *
     * @return the level of the extracurricular activity
     */

    public String getLevel() {
        return level;
    }

    /**
     * Setter for reference field
     *
     * @param reference This is the reference of the extracurricular activity
     */

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    /**
     * Getter for reference field
     *
     * @return the reference of the extracurricular activity
     */

    public Reference getReference() {
        return reference;
    }

}