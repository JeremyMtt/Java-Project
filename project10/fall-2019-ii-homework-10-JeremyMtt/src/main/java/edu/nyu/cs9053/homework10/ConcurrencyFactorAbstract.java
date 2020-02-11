package edu.nyu.cs9053.homework10;

public abstract class ConcurrencyFactorAbstract implements ConcurrencyFactorProvider {
    private final int concurrencyFactor;

    public ConcurrencyFactorAbstract(final int concurrencyFactor) {
        this.concurrencyFactor = concurrencyFactor;
    }

    @Override
	public int getConcurrencyFactor() {
        return concurrencyFactor;
    }
}
