import java.net.*;
import java.io.*;
import java.net.ServerSocket;

public class Conex {

	
	final int PUERTO=1521;
	ServerSocket sc;
	Socket so;
	DataOutputStream salida;
	String mensajeRecibido;
	
	public void initServer()
	{
		BufferedReader entrada;
		
		try
		{
			sc = new ServerSocket(PUERTO);
			so = new Socket(;)
			System.out.println("Esperando una conexion:");
			so = sc.accept();
			System.out.println("Un cliente se ha conectado.");
			
			
			
			
			
		}
	}
}
