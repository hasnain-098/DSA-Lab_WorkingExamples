import java.util.HashMap;

public class SearchOperationInHashTable {

    static final int SIZE = 10;

    static class DataItem {
        int key;
    }

    static HashMap<Integer, DataItem> hashMap = new HashMap<>();

    static int hashCode(int key) {
        return key % SIZE;
    }

    static DataItem search(int key) {
        int hashIndex = hashCode(key);

        while (hashMap.get(hashIndex) != null) {
            if (hashMap.get(hashIndex).key == key) {
                return hashMap.get(hashIndex);
            }

            ++hashIndex;

            hashIndex %= SIZE;
        }

        return null;
    }

    public static void main(String[] args) {

        DataItem item1 = new DataItem();
        item1.key = 25;

        DataItem item2 = new DataItem();
        item2.key = 64;

        DataItem item3 = new DataItem();
        item3.key = 22;

        int hashIndex1 = hashCode(item1.key);
        hashMap.put(hashIndex1, item1);

        int hashIndex2 = hashCode(item2.key);
        hashMap.put(hashIndex2, item2);

        int hashIndex3 = hashCode(item3.key);
        hashMap.put(hashIndex3, item3);

        int keyToSearch = 64;
        DataItem result = search(keyToSearch);

        System.out.println("The element to be searched: " + keyToSearch);
        if (result != null) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
