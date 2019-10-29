import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
public class Client {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);

        Socket soc = new Socket("127.0.0.1",1342);

        Scanner scan1 = new Scanner(soc.getInputStream());

        System.out.println("Enter any number");
        int number = scan.nextInt();

        PrintStream printStreams = new PrintStream(soc.getOutputStream());

        printStreams.println(number);

        int temp = scan1.nextInt();
        System.out.println(temp);
        
    }

}
