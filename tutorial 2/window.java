import java.util.Scanner; 

public class window{
	public String direction; 

	public window (String direction){
	this.direction = direction;
	}

	public String getDirection(){
		return direction;
	}

	public void setDirection( String direction){
		this.direction = direction;
	}

	public String toString(){
		return getDirection();
	}
}

