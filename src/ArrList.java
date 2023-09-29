package src;

public class ArrList { // like java ArrayList
    public String[] theArray; // where the list items are
    public int eltcount;      // how many elements are in the array
    public int end;           // index of the last element

    public ArrList(int size) {
        this.theArray = new String[size];
        int eltcount = 0;
        end = 0;
    }

    public boolean isEmpty() {
        return this.eltcount == 0;
    }

    public void addLast1(String newItem) {
        this.end = this.end + 1;
        this.theArray[this.end] = newItem;
    }

    public void addLast2(String newItem) {
        if (this.isEmpty()) {
            this.end = this.end + 1;
        }
        this.eltcount = this.eltcount + 1;
        this.theArray[this.end] = newItem;
    }

    // get an element by its position in the list
    public String get (int index) {
        if ((index >= 0) && (index < this.theArray.length)) {
            return theArray[index];
        }
        throw new IllegalArgumentException("array index " + index + " out of bounds");
    }


}
