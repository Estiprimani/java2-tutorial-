import java.util.Scanner; 

public class dimension {
	public int width; 
	public int length; 

	public dimension ( int width, int length){
		this.width = width; 
		this.length = length;
	}

	public int getWidth(){
		return width;
	}

	public int getLength(){
		return length;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public void setLength(int length){
		this.length = length;
	}

	public String toString(){
		return getWidth() + "x" + getLength();
	} 
}