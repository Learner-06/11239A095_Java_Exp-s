import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create server socket on port 5000
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            // Wait for client connection
            Socket s = ss.accept();
            System.out.println("Client connected!");

            // Receive message
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String message = in.readLine();
            System.out.println("Client says: " + message);

            // Send reply
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            out.println("Hello Client, message received!");

            // Close all
            in.close();
            out.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
