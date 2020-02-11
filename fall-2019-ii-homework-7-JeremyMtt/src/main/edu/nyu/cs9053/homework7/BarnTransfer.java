package edu.nyu.cs9053.homework7;

public class BarnTransfer<T> {
    
    public <T extends Animal>void Barntransfer(Repository<? extends T> formrepository,Repository<? super T> transferedrepository) {
	if(formrepository == null || transferedrepository == null) {
	    transferedrepository = null;
	}
	for(int i = 0; i < formrepository.getArraySize(); i++) {
	    transferedrepository.add(formrepository.get(i));
	}
    }
}
