package edu.nyu.cs9053.homework10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * User: blangel
 */
public class ModernFortification extends ConcurrencyFactorAbstract implements Fortification<ExecutorService> {

    private final ExecutorService executor;
    
    public ModernFortification(int concurrencyFactor) {
	super(concurrencyFactor);
	this.executor = Executors.newFixedThreadPool(concurrencyFactor);
    }

    @Override
	public void handleAttack(AttackHandler handler) {
	for (int i = 0; i < getConcurrencyFactor(); i++) {
	    executor.submit(new Runnable(){
		    @Override
			public void run() {
			handler.soldiersReady();
		    }
		});
            return;
	}
    }

    @Override
	public void surrender() {
	executor.shutdown();
    }
}
