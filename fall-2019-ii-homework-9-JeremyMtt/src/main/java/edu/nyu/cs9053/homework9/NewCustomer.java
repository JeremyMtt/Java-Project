package edu.nyu.cs9053.homework9;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.Random;

public class NewCustomer implements Customer{
    
    private final Semaphore semaphore;
    private final static Random random = new Random();
     
    public NewCustomer(Semaphore semaphore) {
	this.semaphore = semaphore;
    }

    @Override
	public OrderNumber order(Queue queue) {
	if(queue == null) {
	    throw new IllegalArgumentException("no customer");
	}
	
	try {
	    semaphore.acquire();
	    if(!queue.full()) {
		return queue.addOrder(ChooseDrink());
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
    
    private CoffeeDrink ChooseDrink() {
        ArrayList<CoffeeDrink> coffeedrink = new ArrayList<>(4);
        coffeedrink.add(new Latte());
        coffeedrink.add(new Frappuccino());
        coffeedrink.add(new CoffeeWithMilk());
        coffeedrink.add(new Tea());
        return coffeedrink.get(random.nextInt(4));

    }

}
