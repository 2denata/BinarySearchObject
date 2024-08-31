
public class SearchingObject implements Comparable {

    private int identity;

    public SearchingObject() {
    }

    public SearchingObject(int identity) {
        this.identity = identity;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    @Override
    public int compareTo(Object t) {
        // If the identity of the current object is equal to the identity of the passed object, return 0 (indicating equality).
        if (((SearchingObject) t).getIdentity() == identity) {
            return 0;
        }
        // If the identity of the current object is greater than the identity of the passed object, return 1.
        else if (((SearchingObject) t).getIdentity() <= identity) {
            return 1;
        }
        // If the identity of the current object is less than the identity of the passed object, return -1.
        return -1;
    }

    public static int binarySearch(Object[] o, Object key, int first, int last) {
        // Calculate the middle index between the first and last indices.
        int mid = (last + first) / 2;
        if (last >= first) {
            // If the element at the middle index matches the key, return the middle index.
            if (((Comparable) o[mid]).compareTo(key) == 0) {
                return mid;
            }
            // If the element at the middle index is greater than the key, search in the left half.
            else if (((Comparable) o[mid]).compareTo(key) > 0) {
                return binarySearch(o, key, first, mid - 1);
            }
            // If the element at the middle index is less than the key, search in the right half.
            else if (((Comparable) o[mid]).compareTo(key) < 0) {
                return binarySearch(o, key, mid + 1, last);
            }
        }
        // If the key is not found, return -1.
        return -1;
    }

}
