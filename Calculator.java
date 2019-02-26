package cse360assign2;


/**Name: Unique Ratliff
 * ClassID: 532
 * Assignment #: 2
 * Description: This program is a basic calculator.
*/

public class Calculator {

    private int total;
    private String history;
    
    /** 
     * The class constructor.
    */
    public Calculator () {
        total = 0;  // not needed - included for clarity
        history = "0";
    }
    
    /** 
     * Gets the current total number that the math operations are being performed on.
     * @return Integer that is the calculator's total
    */
    public int getTotal () {
        return total;
    }
    
    /** 
     * Adds a value to the total value.
     * @param Integer to be added to the total value 
    */
    public void add (int value) {
        total += value;
        history += (" + " + value);
    }
    
    /** 
     * Subtracts a value from the total value.
     * @param Integer to be subtracted from the total value
    */
    public void subtract (int value) {
        total -= value;
        history += (" - " + value);
    }
    
    /** 
     * Multiplies a value with the total value.
     * @param Integer to multiply the total value by
    */
    public void multiply (int value) {
        total *= value;
        history += (" * " + value);
    }
    
    /** 
     * Divides the total by a value. 
     * The method uses integer division, and dividing by zero does not produce an error. 
     * @param Integer to divide the total value by
    */
    public void divide (int value) {
        if (value == 0){
            total = 0;
        }
        else{
            total /= value;
        }
        history += (" / " + value);
    }
    
    /** 
     * Displays a history of the operation that have been done so far.
     * The String history is modified when each operation method is called.
     * @return String with the program's history 
    */
    public String getHistory () {        
        return history;
    }
}
