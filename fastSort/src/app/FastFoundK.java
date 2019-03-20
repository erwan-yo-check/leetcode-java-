package app;

/**
 * 这里实现一个当初伟冰叫我做的快排查找第K大数字的方法
 */

public class FastFoundK {
    public static void foundK(int[] arr, int k, int low, int high) {
        int start = low;
        int end = high;
        int key = arr[low];


        while (start < end) {
            while (start < end && arr[end] >= key) {
                end --;
                if (arr[end] < key) {
                    int temp =arr[end];
                    arr[end] = arr[start];
                    arr[start] = temp;
                }
            }
            while (start < end && arr[start] <= key) {
                start ++;
                if (arr[start] > key) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                }
            }
        }
        // 结束一轮的操作，找到a[low]的自己最终位置；并且start == end

        if (k == start) { //找到第k大了
            System.out.println(key);
        } else {
            if (start > k) { //找到的是后k大的
                foundK(arr, k, low, start);
            } else { //找到的是前k大的
                foundK(arr, k, start, high);
            }
        }
        
        

    }

    public static void main(String arg[]) throws Exception {
        int[] a = {12,20,5,16,15,1,30,45,23,9};
        int start = 0;
        int end = a.length-1;
        foundK(a, 3, start, end);
        System.out.println("array");
        for(int i = 0; i<a.length; i++){
             System.out.println(a[i]);
         }

    }
}