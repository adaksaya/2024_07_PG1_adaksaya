package odevler.bolum02;
import java.util.Scanner;
public class Q08 {
    /*
    (Current time)
    Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT.
     Revise the program so that it prompts the user to enter the time zone offset to GMT and
     displays the time in the specified time zone.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT: ");
        long offset = scanner.nextLong();
        long totalMillieSeconds = System.currentTimeMillis();
        long totalSeconds = totalMillieSeconds / 1000; // toplam saniyeyi bul (1000 ms = 1 sn)
        long currentSeconds = totalSeconds % 60; // güncel saniye

        long totalMinutes = totalSeconds / 60; // toplam dakikayı bul (60 saniye = 1 dakika)
        long currentMinutes = totalMinutes % 60; // güncel dakika

        long totalHours = totalMinutes / 60; // toplam saat'i bul (60 dakika = 1 saat)
        long currentHours = (totalHours + offset) % 24; // kullanıcının girdigi offset degerine göre belirlenen güncel saat

        System.out.println("The current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
}



