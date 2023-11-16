package ca.nl.cna.quintin.java1.Tests.Test1;

/**
 * Class to represent a course at the College.
 *
 * @author quintin.tuck
 */
public class Course {

    private String name;
    private String number;
    private int credits;

    /**
     * Constructor for the course. Takes name, number, and credits.
     * @param name Name for the course.
     * @param number Course number written as a string i.e. "CP2208".
     * @param credits Credit value of course. Must be positive number, otherwise is set to 0.
     */
    public Course(String name, String number, int credits) {
        this.name = name;
        this.number = number;
        if(credits >= 0) {
            this.credits = credits;
        }
    }

    /**
     * get name.
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * set name.
     * @param name Course name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get number.
     * @return number.
     */
    public String getNumber() {
        return number;
    }

    /**
     * set number.
     * @param number Course number.
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * get credits.
     * @return credits.
     */
    public int getCredits() {
        return credits;
    }

    /**
     * set credits.
     * @param credits New credit value for the course. Must be positive or credit value is not changed.
     */
    public void setCredits(int credits) {
        if(credits >= 0) {
            this.credits = credits;
        }
    }

}
