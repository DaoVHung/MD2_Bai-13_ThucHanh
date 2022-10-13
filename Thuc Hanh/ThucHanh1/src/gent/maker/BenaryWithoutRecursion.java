package gent.maker;

public class BenaryWithoutRecursion {
    static int[] list = {2, 5, 6, 23, 45, 34, 72};
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int hight = list.length - 1;
        while (hight >= low) {
            int mid = (hight - low) / 2;
            if (key < list[mid]) {
                hight = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                return low = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,34));
    }

}
