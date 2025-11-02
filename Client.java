import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to server (localhost = same computer)
            Socket s = new Socket("localhost", 5000);

            // Send message
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            out.println("Hello Server!");

            // Receive reply
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String reply = in.readLine();
            System.out.println("Server says: " + reply);

            // Close all
            in.close();
            out.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
