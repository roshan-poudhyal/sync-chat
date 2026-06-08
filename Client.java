import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        try {

            Socket socket =
                    new Socket("localhost", 5000);

            System.out.println("Connected to Server!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}