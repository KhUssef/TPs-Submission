public class tp1ex3 {
}
class CustomArrayList {
    private int[] idk;
    private int used;

    CustomArrayList() {
        idk = new int[10];
        used = 0;
    }

    CustomArrayList(int initialSize) {
        idk = new int[initialSize];
    }

    public void add(int obb) {
        if (used == idk.length) {
            int[] idk1 = new int[idk.length + 5];
            System.arraycopy(idk, 0, idk1, 0, idk.length);
            idk = idk1;
        }
        idk[used++] = obb;
    }

    public void add(int index, int x) {
        if (index >= idk.length) {
            int[] idk1 = new int[index + 1];
            System.arraycopy(idk, 0, idk1, 0, idk.length);
            idk = idk1;
            idk[index] = x;
            used = index + 1;
        } else {
            idk[index] = x;
        }
    }

    public int get(int index) {
        return idk[index];
    }

    public int size() {
        return used;
    }

    public boolean isEmpty() {
        return (used == 0);
    }

    public boolean isIn(int x) {
        for (int i = 0; i < used; i++) {
            if (idk[i] == x) {
                return true;
            }
        }
        return false;
    }

    public int find(int x) {
        for (int i = 0; i < used; i++) {
            if (idk[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int x) {
        int j = 0;
        for (int i = 0; i < used; i++) {
            if (idk[i] == x) {
                j = i;
                break;
            }
        }
        for (; j < used - 1; j++) {
            idk[j] = idk[j + 1];
        }
        used--;
    }
}
