import java.util.ArrayList;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//satiş maşininda mövcud olan bütün ickileri göstərin.
//        for (Drink drink : Drink.values()) {
//            System.out.println(drink);
//        }
//İstifadəçiyə müvafiq kodu daxil edərək elementi seçməyə icazə verin.
            Scanner scanner = new Scanner(System.in);
            ArrayList<Drink> icki = new ArrayList<>();
            boolean secilenicki = true;
        while (secilenicki) {
            System.out.println("İçki kodu seçin (0 bitirmək üçün): ");
            int kodu = scanner.nextInt();
            if (kodu == 0) {
                secilenicki = false;
            } else if (kodu > 0 && kodu <= Drink.values().length) {
                Drink secilmis = Drink.values()[kodu - 1];
                icki.add(secilmis);
                System.out.println("Seçildi: " + secilmis);
            } else {
                System.out.println("Səhvlik. Yenidən cəhd edin.");
            }

        // Seçilmiş içkilərin ümumi qiymətini hesablayın və göstərin
            double umumi = 0.0;
            System.out.println("Seçilmiş içkilər:");
            for (Drink drink : icki) {
                System.out.println(drink);
                umumi += drink.getPrice();
            }
            System.out.println("Ümumi qiymət: " + umumi);
        }

        }}