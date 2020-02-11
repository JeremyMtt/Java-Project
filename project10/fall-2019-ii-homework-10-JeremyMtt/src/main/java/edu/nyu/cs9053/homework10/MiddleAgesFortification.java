package edu.nyu.cs9053.homework10;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * User: blangel
 */
public class MiddleAgesFortification extends ConcurrencyFactorAbstract implements Fortification<Thread> {
    private final Thread[] thread;
    private final AtomicInteger running;
    
    public MiddleAgesFortification(int concurrencyFactor) {
	super(concurrencyFactor);
        this.thread = new Thread[concurrencyFactor];
        this.running = new AtomicInteger(0);
        this.getThread();
    }
    
    @Override
	public void handleAttack(AttackHandler handler) {
	if (running.get() < getConcurrencyFactor()) {
            for (int i = 0; i < getConcurrencyFactor(); i++) {
                if (!thread[i].isAlive() ) {
                    running.incrementAndGet();
                    thread[i] = new Thread(new Runnable() {
                        @Override
			    public void run() {
                            handler.soldiersReady();
                            running.decrementAndGet();
                        }
			});
                    thread[i].start();
                    return;
                }
            }
        }
    }

    @Override
	public void surrender() {
	Thread.currentThread().interrupt();
    }
    
    public void getThread() {
	for (int i = 0; i < getConcurrencyFactor(); i++) {
	    thread[i] = new Thread();
	}
    }

}