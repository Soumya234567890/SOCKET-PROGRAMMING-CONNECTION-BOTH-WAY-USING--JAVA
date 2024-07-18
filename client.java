import java.io.*;
import java.net.*;
public class client {
    public static void main(String[] args) throws Exception {
        Socket s=new Socket("127.0.0.1",3000);
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        String str1=br.readLine();
        dos.writeUTF(str1);
        String str2=dis.readUTF();
        System.out.println("Server :" + str2);
        dos.flush();
        dos.close();
        s.close();
        
    }
    
}
