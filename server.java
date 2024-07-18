import java.io.*;
import java.net.*;

public class server{
    public static void main(String[] args)throws Exception {
        ServerSocket ss=new ServerSocket(3000);
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String Str1=dis.readUTF();
        System.out.println("Client :" + Str1);
        String Str2=br.readLine();
        dos.writeUTF(Str2);
        dos.flush();
        dis.close();
        s.close();
        ss.close();
    }

}