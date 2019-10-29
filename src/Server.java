import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String args[]) throws IOException {

        ServerSocket serverSocket = new ServerSocket(1342);
        Socket socket = serverSocket.accept();

        Scanner scan = new Scanner(socket.getInputStream());
        int number = scan.nextInt();

        int temp = number*2;

        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println(temp);

    }
}
