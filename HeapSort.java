public class HeapSort {
  
    public static void heapSort(int[] arr) {
        int n = arr.length;
  
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
  
            heapify(arr, i, 0);
        }
    }
  
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
  
        
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }
  

        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }
  
       
        if (largest != i) {
           
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
  
           
            heapify(arr, n, largest);
        }
    }
  
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 6, 3};
  
        System.out.println("Array sebelum diurutkan: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
  
        heapSort(arr);
  
        System.out.println("\nArray setelah diurutkan: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
