package pa11;

public class HashSet {

    /**
     * Constructor for the set
     */
    public HashSet() {
        System.out.println("HashSet");
    }

    /**
     * Size of the set
     * @return the number of elements in the set
     */
    public int size() {
        System.out.println("Size");
        return 0;
    }

    /** 
     * Check if the set is empty
     * @return a boolean indicating whether the set is empty
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * Add an element to the set
     * @param s the element to add
     * @return the old value associated with the key, or null if no such entry exists
     */
    public void add(String s) {
        System.out.println("Adding " + s);
    }

    /** 
     * Remove an element from the set
     * @param s the element to remove
     * @return the value associated with the key, or null if no such entry exists
     */
    public void remove(String s) {
        System.out.println("Removing " + s);
    }

    /** 
     * Check if the set contains an element
     * @param s the element to check for
     * @return a boolean indicating whether the set contains the element
     */
    public boolean contains(String s) {
        System.out.println("Contains " + s);
        return false;
    }

    /** 
     * Clears the set
     */
    public void clear() {
        System.out.println("Clear");
    }

    /** 
     * Convert the set to an array
     * @return an array containing all the elements in the set
     */
    public String[] toArray() {
        return null;
    }

    /** 
     * Takes the intersection of the current set and the `other` set
     * @param other the set to intersect with
     * @return a new `HashSet` containing the intersection of the current set and the `other` set
     */
    public HashSet intersection(HashSet other) {
        return null;
    }

    /** 
     * Convert the set to a string
     * @param other the set to union with
     * @return a new `HashSet` containing the union of the current set and the `other` set
     */
    public HashSet union(HashSet other) {
        return null;
    }

    /** 
     * Takes the difference of the current set and the `other` set 
     * @param other the set to take the difference with
     * @return a new `HashSet` containing the difference of the current set and the `other` set
     */
    public HashSet difference(HashSet other) {
        return null;
    }

    /** 
     * Check if the current set is a subset of the `other` set
     * @param other the set to check for a subset
     * @return a boolean indicating whether the current set is a subset of the `other` set
     */
    public boolean subset(HashSet other) {
        return false;
    }
        
}
