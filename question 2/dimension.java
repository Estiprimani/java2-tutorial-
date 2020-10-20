import java.util.*;

public class dimension{
	public int width; 
	public int length; 

	public dimension (int inWidth, int inLength){
		this.width = inWidth;
		this.length = inLength;
	}

	public int getWidth(){
		return width;
	}
	
	public int getLength (){
		return length;
	}

	public void setWidth( int inWidth){
		this.width = inWidth;
	}

	public void seLength(int inLength){
		this.length = inLength;
	}

	public String toString(){
		return getLength() + "x" + getWidth();
	}

}