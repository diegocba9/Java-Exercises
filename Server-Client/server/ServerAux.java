package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;

import balancer.Balancer;

public class ServerAux {
	
	private static ArrayList <Server> serverList = new ArrayList<Server>();
	
	private DataOutputStream output;
	
	private ServerSocket serverSocket;
	private Semaphore semaphore;
	
	Random rand = new Random();
	
	public ServerAux (int serverQuantity) {
		for (int i=0; i<serverQuantity; i++) {
			Server server = new Server();
			serverList.add(server);
		}
		try {
			this.serverSocket = new ServerSocket(123);
		}
		catch (Exception e) {
			throw new RuntimeException (e);
		}
	}
	private void connect() {
		try {
			System.out.println("Waiting for client to connect");
			Socket clientSocket = serverSocket.accept();
			DataInputStream input = new DataInputStream (clientSocket.getInputStream());
			output = new DataOutputStream (clientSocket.getOutputStream());
			Balancer worker = new Balancer (input, output, this, semaphore);
			input = new DataInputStream(clientSocket.getInputStream());
			worker.start();
		}
		catch (IOException e){
			throw new RuntimeException(e);
		}
	}
	
	public void dispatch() {
		while (true) {
			connect();
			System.out.println("Client connected");
		}
	}
	
	public void setSemaphore(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	private void consistence (int num, Server currentServer, FileWriter fw1, FileWriter fw2, FileWriter fw3) {
		if (currentServer.getId() == 0) {
			serverList.get(1).writeFile(num, fw1, fw2, fw3);
			serverList.get(2).writeFile(num, fw1, fw2, fw3);
		}
		else if (currentServer.getId() == 1) {
			serverList.get(0).writeFile(num, fw1, fw2, fw3);
			serverList.get(2).writeFile(num, fw1, fw2, fw3);
		}
		else if (currentServer.getId() == 2){
			serverList.get(0).writeFile(num, fw1, fw2, fw3);
			serverList.get(1).writeFile(num, fw1, fw2, fw3);
		}
	}
	
	public void writeRequest (int num, FileWriter fw1, FileWriter fw2, FileWriter fw3, DataOutputStream output) {
		Server server = serverList.get(rand.nextInt(3));
		server.writeFile(num, fw1, fw2, fw3);
		sendOutput(server.isPrime(num), output);
		consistence(num, server, fw1, fw2, fw3);
	}
	
	public void readRequest () {
		Server server = serverList.get(rand.nextInt(3));
		server.readFile();
	}
	
	private void sendOutput(boolean prime, DataOutputStream output) {
		try {
			output.writeBoolean(prime);
			output.flush();
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
