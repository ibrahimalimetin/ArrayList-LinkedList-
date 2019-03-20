
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ibrahim Ali Metin
 */
public class ArrayandLinkedListMain {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        
        zamanHesapla("Linkedlist", linkedlist);
        zamanHesapla("Arraylist", arraylist);
        
    }
    
    public static void zamanHesapla(String veri_tipi, List<Integer> list){
        
        //Listin sonuna değer ekleme
        long baslangic_zamani;
        long bitis_zamani;
        
        baslangic_zamani = System.currentTimeMillis(); //for döngüsü başlamadan zamanı alacağız
        for (int i = 0 ; i < 100000 ; i++){
            list.add(0 , i); 
            /* ilk index 'e değer eklemede Arraylist kaydırma işlemi yaptığı 
            için performans kaybı yaşar, linkedlist değerleri referans ile tuttugunda yalnızca 
            ilk 2 referansı değiştirir. */
        }
        bitis_zamani = System.currentTimeMillis();// for dongusu bittiği zamanı alacağız 
        System.out.println(veri_tipi + " Ekleme Süresi " + (bitis_zamani - baslangic_zamani) + " ms");
    }
}
