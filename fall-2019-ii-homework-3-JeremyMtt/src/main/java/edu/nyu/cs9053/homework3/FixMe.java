package edu.nyu.cs9053.homework3;

import edu.nyu.cs9053.homework3.metadata.Processor;

/**
 * User: blangel
 */
public class FixMe {

    private final String name;

    public final String metadata;

    public final static String DEFAULT_NAME  = "Eric";

    public final static String DEFAULT_METADATA = "0";

    public FixMe(){
	this(DEFAULT_NAME,DEFAULT_METADATA,true);
    }

    public FixMe(String name) {
        this(name,DEFAULT_METADATA);
    }
    
    public FixMe(String name, String metadata){
	this(name,metadata,true);
    }

    public FixMe(String name, String metadata, boolean strict) {
        this.name = name;
        this.metadata = new Processor(strict).processMetadata(metadata);
    }

    public FixMe changeName(String name) {
        return new FixMe(name,metadata,false);
    }

    public FixMe changeName(String firstName, String lastName){ 
        return new FixMe(getFullName(firstName, lastName), metadata,false);
    }

    public String getFullName(String firstName, String lastName) {
        return String.format("%s %s", firstName, lastName);
    }

    public String getName() {
        return name;
    }

}
