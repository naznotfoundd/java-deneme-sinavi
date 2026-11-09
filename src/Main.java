import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogru;
        int yanlis;
        int bos;
        double net;

        System.out.print("Doğru sayısını giriniz: ");
        dogru = scanner.nextInt();

        System.out.print("Yanlış sayısını giriniz: ");
        yanlis = scanner.nextInt();

        if (dogru < 0 || yanlis < 0 || dogru + yanlis > 20) {
            System.out.println("Hatalı giriş yaptınızz");
        } else {
            bos = 20 - (dogru + yanlis);
            net = dogru - (yanlis / 4.0);

            System.out.println("Boş: " + bos);
            System.out.println("Net: " + net);

            if (net < 5) {
                System.out.println("Başarısız");
            } else if (net < 10) {
                System.out.println("Geliştirilmeli");
            } else if (net < 15) {
                System.out.println("Orta");
            } else {
                System.out.println("Başarılı");
            }
        }

        scanner.close();
    }
}
