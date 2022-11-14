package server;

import java.util.concurrent.Semaphore;

import balancer.Balancer;

public class ServerMain {
	
	public static void main(String[] args) {	
		ServerAux aux = new ServerAux(3);
		Semaphore semaphore = new Semaphore(1, true);
		
		Balancer balancer = new Balancer(aux, semaphore);
		balancer.start();
	}
}
