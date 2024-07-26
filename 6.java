//SERVERSIDE.JAVA

import java.io.*; import java.net.*;
public class ServerSide
 { public static void main(String[]args)
{ try{
ServerSocketss=new ServerSocket(3306); 
Socket s=ss.accept();//establishes connection
DataInputStream dis=new DataInputStream(s.getInputStream()); 
String str=(String)dis.readUTF();
System.out.println("message= "+str); ss.close();
}catch(Exception e){System.out.println(e);}
}
}


//CLIENTSIDE.JAVA

import java.io.*;
 import java.net.*;
public class ClientSide {
public static void main(String[] args) { 
try{
Socket s=new Socket("localhost",3306);
DataOutputStreamdout=new DataOutputStream(s.getOutputStream()); dout.writeUTF("Hello Server");
dout.flush() 
dout.close();
s.close();
}
catch(Exception e)
{
System.out.println(e);}
}
} 
