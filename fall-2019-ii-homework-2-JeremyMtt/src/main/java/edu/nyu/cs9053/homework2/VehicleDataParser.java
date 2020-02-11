
package edu.nyu.cs9053.homework2;
/**
 * User: blangel
 */
public class VehicleDataParser {

    /**
     * Given a 4 byte response, {@code mode01Pid00Response}, parse according to the {@literal SAE J1979} documentation.
     * For example, if {@code mode01Pid00Response} was {@literal 0xBE1FA813} the return value would be equal to:
     * {@literal new int[] { 0x01, 0x03, 0x04, 0x05, 0x06, 0x07, 0x0C, 0x0D, 0x0E, 0x0F, 0x10, 0x11, 0x13, 0x15, 0x1C, 0x1F, 0x20}}
     * @param mode01Pid00Response four byte response
     * @return an array of supported PID values given the input, {@code mode01Pid00Response}
     * @see {@literal https://en.wikipedia.org/wiki/OBD-II_PIDs#Service_01_PID_00}
     */
    public static int[] supportedPids(int mode01Pid00Response) {
	int[] Binary ;
	Binary = new int[32];
	int ones = 0;
	for(int i = 0;i<32;i++) {
	    Binary[i] = ((mode01Pid00Response >> (31-i)) & 0x00000001);
	    if(Binary[i] == 1) {
		ones++;
	    }
	    
	}
	
	int[] supportedpid = new int[ones];
	for (int i=0,j=0;i<32;i++) {
	    if(Binary[i]==1){
	       supportedpid[j] = i+1;
	       j++;
	    }
	}
	return supportedpid;
    }

    /**
     * Given a {@code pid} between [0x1,0x20] return true iff {@code mode01Pid00Response} supports it.
     * @param pid value between [0x1,0x20] to check for support within {@code mode01Pid00Response}
     * @param mode01Pid00Response four byte response
     * @return true iff {@code mode01Pid00Response} supports {@code pid}.
     * @throws IllegalArgumentException if {@code pid} is less than 0x1 or greater than 0x20
     */
    public static boolean isSupported(int pid, int mode01Pid00Response) {
	int supportedpid[] =  supportedPids(mode01Pid00Response);
	boolean result1 = false;
	int[] Binary;
	Binary = new int[32];
	int ones = 0;
	for(int i = 0;i<32;i++) {
	    Binary[i] = ((mode01Pid00Response >> (31-i)) & 0x01);
	    if(Binary[i] == 1) {
		ones++;
	    }
	    
	}
	if (pid < 0x1 || pid >0x20) throw new IllegalArgumentException();
	else{for(int i=0;i<ones;i++){
		if(pid == supportedpid[i]){
		    result1 = true;
		    break;
		}
		else{
		    result1 = false;
		}
	    }
	}
	return result1;
    }

}

