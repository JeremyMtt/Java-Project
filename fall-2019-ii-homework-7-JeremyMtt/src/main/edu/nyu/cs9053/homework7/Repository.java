package edu.nyu.cs9053.homework7;

public class Repository<T>{
    
    private T[] array;
    
    private int arraysize;
    
    private final ArrayCreator<? extends T> arraycreator;

    @SuppressWarnings("unchecked")
    public  Repository(ArrayCreator<? extends T> arraycreator, int arraysize){
	this.arraycreator = (ArrayCreator<T>) arraycreator;
	this.array = arraycreator.create(arraysize);
	this.arraysize = 0;
    }
    
    public boolean add(T value) {
	T[] newarray = arraycreator.create(this.arraysize + 1);
	if(contains(value)) {
	    return false;
	}
	for(int i = 0; i < (this.arraysize); i++) {
	    newarray[i] = this.array[i];
	}
	newarray[this.arraysize] = value;
	this.array = newarray;
	this.arraysize += 1;
	return true;
    }
    
    public boolean contains(T value) {
	if(value == null || array == null) {
	    return false;
	}
	for(int i = 0; i < this.arraysize; i++) {
	    if(this.array[i].equals(value)) {
		return true;
	    }
	}
	return false;
    }
    
    public boolean remove(T value) {
	if(value == null || array == null) {
	    return false;
	}
	if(!this.contains(value)) {
	    return false;
	}
	int len = array.length;
	for(int i = 0; i < len; i++) {
	    if(this.array[i].equals(value)) {
		for(int j = i; j < len - 1; j++) {
		    array[j] = array[j + 1];
		}
		array[len - 1] = null;
		break;
	    }
	}
	arraysize --;
	return true;
    }

    public T get(int index){
	if(index >= array.length || index<0){
	    return null;
	}
	return array[index];
    }
    
    public int getArraySize(){
	return arraysize;
    }
}

