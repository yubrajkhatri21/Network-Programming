import java.net.InetAddress;
import java.net.UnknownHostException;

public class Example { // Class name should start with an uppercase letter

    public static void main(String[] args) {
        try {
            // Get the InetAddress object for a single hostname
            InetAddress ia = InetAddress.getByName("www.google.com.np");
            System.out.println("IP address of www.google.com.np: " + ia.getHostAddress());

            // Get all InetAddress objects for a hostname
            InetAddress[] ias = InetAddress.getAllByName("www.google.com");

            // Print all IP addresses associated with "www.google.com"
            System.out.println("IP addresses of www.google.com:");
            for (InetAddress ip : ias) {
                System.out.println(ip.getHostAddress());
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}