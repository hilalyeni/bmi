import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kilo, boy;
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        double sonuc = kilo / (boy * boy);
        System.out.println("Vücut Kitle Endeksiniz: " + sonuc);
    }
}