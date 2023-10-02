package src;

public class ArrListLecture {
    public String[] theArray; // Underlying array that
    // stores the elements

    public int end; // Index of last used slot in the array
                    // That works, but not when array is empty
    public int eltcount = 0;  // Number of used elements

    public ArrListLecture(int size) {
        this.theArray = new String[size]; // Set up array
        this.end = 0;
        this.eltcount = 0;
    }

    public boolean isEmpty() { return this.eltcount == 0; }

    public void addLast(String newItem) {
        this.end = this.end + 1; // Update where we think last element should go
        this.theArray[this.end] = newItem;
        this.eltcount += 1;
    }

    public void addLast2(String newItem) {
        if (!this.isEmpty()) {
            this.end = this.end + 1; // Update where we think last element should go
        }
        this.theArray[this.end] = newItem;
        this.eltcount += 1;


    }




}
