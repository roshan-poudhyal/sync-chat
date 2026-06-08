import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket =
                    new ServerSocket(5000);

            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            Socket socket =
                    serverSocket.accept();

            System.out.println("Client Connected!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}