import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.net.Socket;


/* This class sends data to the server to log; it is used
 * as a test class */
public class MyClient {
	public static final String hostname = "localhost";
	public static final int portNum = 4444;
	
	public static void main(String[] args) {
		
		String msg = "message 1";
		try {
			// server is listening on http://localhost:4444
			Socket serversSocket = new Socket(hostname, portNum);
			PrintWriter clientOut = new PrintWriter(serversSocket.getOutputStream(), true);

			// send first message
			clientOut.println(msg);
			
			msg = "message 2";
			// send second message
			clientOut.println(msg);
			
			msg = "exit";
			// this will stop the server
			clientOut.println(msg);
			/*File f = new File("blueJasmine.jpg");
			BufferedOutputStream outStream = new BufferedOutputStream(serversSocket.getOutputStream());
		    final BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(f));
		    final byte[] buffer = new byte[4096];
		    for (int read = inStream.read(buffer); read >= 0; read = inStream.read(buffer))
		        outStream.write(buffer, 0, read);
		    inStream.close();
		    outStream.close();*/
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
