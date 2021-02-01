/*

Create from enum Month a class, also and create a methods ordinal() и values().

Requirements:
•	Class Month should be in a separated class.
•	Only one private constructor (with one argument of int type) should be in the class Month.
•	There are should be 12 const type of Month in the class Month.
•	A method values() should return an array with all arguments in the class Month.
•	A method ordinal() should return an ordinal number of element (const).
 */


package TasksOnJava;


public class Month
{
    public static final Month JANUARY = new Month(0);
    public static final Month FEBRUARY = new Month(1);
    public static final Month MARCH = new Month(2);
    public static final Month APRIL = new Month(3);
    public static final Month MAY = new Month(4);
    public static final Month JUNE = new Month(5);
    public static final Month JULY = new Month(6);
    public static final Month AUGUST = new Month(7);
    public static final Month SEPTEMBER = new Month(8);
    public static final Month OCTOBER = new Month(9);
    public static final Month NOVEMBER = new Month(10);
    public static final Month DECEMBER = new Month(11);
    private static final Month[] array = {JANUARY,
            FEBRUARY,
            MARCH,
            APRIL,
            MAY,
            JUNE,
            JULY,
            AUGUST,
            SEPTEMBER,
            OCTOBER,
            NOVEMBER,
            DECEMBER};

    private final int value;

    private Month (int value)
    {
        this.value = value;
    }

    public int ordinal()
    {
        return this.value;
    }

    public static Month[] values()
    {
        return array;
    }
}









