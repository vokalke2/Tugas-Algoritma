public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,14,5,7,10,11};   
        bubbleSort(arr);
       for (int i : arr) {
            System.out.println(i);
        }
        int cari = 14;
        long waktuMulai = System.nanoTime();
        int hasil = BinarySearch(arr, cari);
        long waktuSelesai = System.nanoTime();
        long Durasi = waktuSelesai - waktuMulai;

        if(hasil != -1){
            System.out.print("data ditemukan di index ke-"+ hasil);
        }else {
            System.out.println("data tidak ditemukan");
        }
        System.out.println();
        System.out.println("Linear search membutuhkan waktu :" + Durasi + " nano detik ");
    }

    static void bubbleSort(int array[]) {
        int size = array.length;
        
        for (int i = 0; i < size - 1; i++)
        
          for (int j = 0; j < size - i - 1; j++)
    
            if (array[j] > array[j + 1]) {
    
              int temp = array[j];
              array[j] = array[j + 1];
              array[j + 1] = temp;
            }
      }
    public static int BinarySearch(int[] arr, int cari){
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid = (low + high) /2;

            if(arr[mid] == cari){
                return mid;
            }

            if(arr[mid]< cari){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    public static int linearsearch(int[] arr, int cari){
        for(int i=1; i< arr.length ; i++){
            if(arr[i] == cari){
                return i;
            }

        }
        return -1;
    }
}