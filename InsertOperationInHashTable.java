public class InsertOperationInHashTable {

    static final int SIZE = 4;

    static class DataItem {
        int key;
    }

    static DataItem[] hashArray = new DataItem[SIZE];

    static int hashCode(int key) {
        return key % SIZE;
    }

    static void insert(int key) {
        DataItem newItem = new DataItem();
        newItem.key = key;

        int hashIndex = hashCode(key);

        while (hashArray[hashIndex] != null) {
            hashIndex++;
            hashIndex %= SIZE;
        }
        hashArray[hashIndex] = newItem;
    }

    public static void main(String[] args) {

        insert(42);
        insert(25);
        insert(64);
        insert(22);

        for (int i = 0; i < SIZE; i++) {
            if (hashArray[i] != null) {
                System.out.println("Index " + i + ": Key: " + hashArray[i].key);
            } else {
                System.out.println("Index " + i + ": Empty");
            }
        }
    }
}
