import java.util.*;

public class harddisk {
	public int size;
	public String unit; 

	public harddisk(int inSize, String inUnit){
		this.size = inSize; 
		this.unit = inUnit;
	}

	public int getSize(){
		return size;
	}

	public String getUnit(){
		return unit; 
	}

	public void setSize(int inSize){
		this.size = inSize;
	}

	public void setUnit(String inUnit){
		this.unit = inUnit;
	}

	public String toString(){
		return getSize() + getUnit() + "harddisk";
	}
}