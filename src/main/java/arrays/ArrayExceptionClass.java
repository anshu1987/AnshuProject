/**
 *
 */
package arrays;

/**
 * @author anshu.khandelwal
 *
 */
public class ArrayExceptionClass {

    /**
     * @param This function will throw array Store Exception because
     * we are trying to store integer value to String array.
     */
    public void arrayStoreException() {
        Object x[] = new String[3];
        x[0] = new Integer(0);
    }


}
