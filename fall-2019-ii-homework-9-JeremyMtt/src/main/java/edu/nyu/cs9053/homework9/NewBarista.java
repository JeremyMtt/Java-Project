package edu.nyu.cs9053.homework9;

import java.util.concurrent.Semaphore;

public class NewBarista implements Barista{
    
    private final Semaphore semaphore;

    public NewBarista(Semaphore semaphore) {
	this.semaphore = semaphore;
    }
    @Override
	public OrderNumber handle(Queue from) {
	if(from == null) {
	    throw new IllegalArgumentException("the order shouldn't be null");
	}
	
	try {
	    semaphore.acquire();
	    if(!from.isEmpty()) {
		return from.getOrderNumber();
	    }
	    else {
		return null;
	    }
	}
	catch(InterruptedException e) {
	    Thread.currentThread().interrupt();
            throw new RuntimeException(e);
	}
	finally {
            semaphore.release();
	}
    }
}
