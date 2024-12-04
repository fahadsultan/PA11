package pa11;

public class HashMap {

    /**
     *  Constructor for the map
     */
    public HashMap() {
        System.out.println("HashMap");
    }
    
    /** 
     *  Size of the map
     *  @return the number of elements in the map
     */
    public int size() {
        System.out.println("Size");
    }

    /**
     *  Check if the map is empty
     *  @return a boolean indicating whether the map is empty
     */
    public boolean isEmpty() {
        System.out.println("IsEmpty");
    }

    /**
     *  Get the value associated with the key
     *  @param key the key to get the value for
     *  @return the value associated with the key, or null if no such entry exists
     */
    public String get(String key) {
        System.out.println("Get " + key);
        return null;
    }

    /**
     *  Add an entry to the map
     *  @param key the key to add
     *  @param value the value to add
     *  @return the old value associated with the key, or null if no such entry exists
     */
    public String put(String key, String value) {
        System.out.println("Put " + key + " " + value);
        return null;
    }

    /**
     *  Remove an entry from the map
     *  @param key the key to remove
     *  @return the value associated with the key, or null if no such entry exists
     */
    public String remove(String key) {
        System.out.println("Remove " + key);
        return null;
    }

    /**
     *  Get all the keys in the map
     *  @return all the keys stored in the map
     */
    public String[] keySet() {
        System.out.println("KeySet");
        return null;
    }

    /**
     *  Get all the values in the map
     *  @return all the values stored in the map
     */
    public String[] values() {
        System.out.println("Values");
        return null;
    }
}
