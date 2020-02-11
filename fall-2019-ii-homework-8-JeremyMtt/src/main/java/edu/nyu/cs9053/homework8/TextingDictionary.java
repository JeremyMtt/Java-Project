package edu.nyu.cs9053.homework8;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TextingDictionary {
    
    public final Map<String,List<String>> dictionary = new HashMap<>();
    
    public void insert(String word) {
	checkValid(word);
        String matchingKey = wordmatching(word);
        List<String> insertDic = new LinkedList<>();
        insertDic.add(word);
        dictionary.put(matchingKey, insertDic);
    }
    
    public List<String> search(List<ValidTextKeyPress> values){
	List<String> result = new LinkedList<>();
	if(values.isEmpty()) {
	    return result;
	}
	
	StringBuilder strings = new StringBuilder();
	getmatchingKey(strings,values);
	
	String matchingKey = strings.toString();
	matchValueCollection(result,matchingKey);
	return result;
    }
    
    private void checkValid(String word) {
	boolean ifValid = false;
	if(word == " ") {
	    throw new IllegalArgumentException("Input cannot be null");
        }
        for(char element : word.toCharArray()) {
	    if((element >= 'a' && element <= 'z') || (element >= 'A' && element <='Z')){
		ifValid = true;
	    }
	    if(ifValid == false) {
		throw new IllegalArgumentException("Input Error");
	    }
        }
    }
    
    private String wordmatching(String word) {
	if(word.length() <= 0) {
            throw new IllegalArgumentException("Input cannot be null");
	}
	
	StringBuilder wordmatch = new StringBuilder();
	for(int i = 0; i < word.length();i++) {
	    switch (word.charAt(i)) {
            case 'a':
            case 'b':
            case 'c':
            case 'A':
            case 'B':
            case 'C':
		wordmatch.append('2');
                break;
            case 'd':
            case 'e':
            case 'f':
            case 'D':
            case 'E':
            case 'F':
		wordmatch.append('3');
                break;
            case 'g':
            case 'h':
            case 'i':
            case 'G':
            case 'H':
            case 'I':
		wordmatch.append('4');
                break;
            case 'j':
            case 'k':
            case 'l':
            case 'J':
            case 'K':
            case 'L':
		wordmatch.append('5');
                break;
            case 'm':
            case 'n':
            case 'o':
            case 'M':
            case 'N':
            case 'O':
		wordmatch.append('6');
                break;
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
		wordmatch.append('7');
                break;
            case 't':
            case 'u':
            case 'v':
            case 'T':
            case 'U':
            case 'V':
		wordmatch.append('8');
                break;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
		wordmatch.append('9');
                break;
            default:
                throw new AssertionError("No matching");
	    }
	}
	return wordmatch.toString();
    }
    
    private void getmatchingKey(StringBuilder strings,List<ValidTextKeyPress> values) {
	for(ValidTextKeyPress value : values) {
	    strings.append(value.getValidTextPress());
	}
    }
    
    private void matchValueCollection(List<String> result,String matchingKey) {
	for(String key : dictionary.keySet()) {
	    if(key.startsWith(matchingKey)) {
		List<String> matchingValues = dictionary.get(key);
		result.addAll(matchingValues);
	    }
	}
    }
}