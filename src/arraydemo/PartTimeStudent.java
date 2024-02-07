
package arraydemo;

/**
 *dfgdfgf
 * @author sartaj
 */
public class PartTimeStudent extends Student  {
    private int numCourses;

    public PartTimeStudent(int id, String name) {
        super(id, name);
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
}
