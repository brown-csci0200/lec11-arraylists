package src;

import java.util.Arrays;

public class ArrList { // like java ArrayList
    private String[] theArray; // where the list items are
    private int eltcount;      // how many elements are in the array
    private int end;           // index of the last element

    public ArrList(int size) {
        this.theArray = new String[size];
        this.eltcount = 0;
        this.end = 0;
    }

    /**
     * determine whether the arrList has any elements
     * @return true iff there are no elements in the list
     */
    public boolean isEmpty() {
        return this.eltcount == 0;
    }

    /**
     * determine whether the arrList has any empty space
     * @return true iff every space in array contains data
     */
    public boolean isFull() {
        return this.eltcount == this.capacity();
    }

    /**
     * returns the number of slots in the array,
     *   regardless of whether they are used
     * @return the number of slots in the array
     */
    public int capacity() {
        return this.theArray.length;
    }
    /**
     * get the element at given index (0-based) from the ArrList
     *
     * @param index the position from which to get the value
     * @return the String in the given index (0-based)
     */
    public String get (int index) {
        if ((index >= 0) && (index < this.theArray.length)) {
            return this.theArray[index];
        }
        throw new IllegalArgumentException("array index " + index + " out of bounds");
    }

    /**
     * grow the array to the given size, copying over
     * the existing elements. Code assumes that newSize
     * is larger than the current array capacity
     *
     * @param newSize
     */
    private void resize(int newSize) {
        // make the new array
        String[] newArray = new String[newSize];
        // copy items from the current theArray to newArray
        for (int index = 0; index < this.theArray.length; index++) {
            newArray[index] = this.theArray[index];
        }
        // change this.theArray to refer to the new, larger array
        this.theArray = newArray;
    }

    /**
     * Add an element to the end of the array list,
     * growing the array capacity if needed to accommodate
     * the new item
     *
     * @param newItem -- the string to add to the end
     *                of the list
     */
    public void addLast(String newItem) {
        if (this.isFull()) {
            // add capacity to the array
            this.resize(this.theArray.length * 2);
            // now that the array has room, add the item
            this.addLast(newItem);
        } else {
            if (!(this.isEmpty())) {
                this.end = this.end + 1;
            }
            this.eltcount = this.eltcount + 1;
            this.theArray[this.end] = newItem;
        }
    }

    /**
     * produce string representation of ArrList
     *
     * @return String representation of ArrList
     */
    public String toString() {
        return Arrays.toString(this.theArray);
    }
}
