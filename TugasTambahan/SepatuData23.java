package TugasTambahan;

public class SepatuData23 {

    public static void tampilkanDaftar(Sepatu23[] arr) {
        for (Sepatu23 s : arr) {
            s.tampilSepatu();
        }
    }

    public static void bubbleSortHarga(Sepatu23[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j].harga > arr[j+1].harga) {
                    Sepatu23 temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int sequentialSearch(Sepatu23[] arr, String keyMerk) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].merk.equalsIgnoreCase(keyMerk)) {
                return i;
            }
        }
        return -1;
    }

}
