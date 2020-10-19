import java.util.*;

public class room{
	public String name;
	public int noOfChairs; 
	public boolean isBooked; 

	ArrayList<dimension> dimensions  = new ArrayList <dimension>();
	ArrayList<window> windows = new ArrayList <window>();

	public room(String name, int noOfChairs, boolean isBooked, dimension inDimension, window inWindow ){
		this.name = name;
		this.noOfChairs = noOfChairs;
		this.isBooked = isBooked;
		this.dimensions.add(inDimension);
		this.windows.add(inWindow);
	}

	public String getName(){
		return name; 
	}

	public int getNoOfChairs(){
		return noOfChairs;
	}

	public boolean getIsBooked(){
		return isBooked;
	}

	public ArrayList<dimension> getDimensions(){
		return dimensions;
	}

	public ArrayList<window> getWindows(){
		return windows;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setNoOfChairs(int noOfChairs){
		this.noOfChairs = noOfChairs;
	}

	public void setIsBooked(boolean isBooked){
		this.isBooked = isBooked;
	}

	public void setDimensions  (ArrayList<dimension> inDimension){
		this.dimensions = inDimension;
	}

	public void setWindows (ArrayList<window> inWindow){
		this.windows = inWindow;

	}

	public String toString (){
		return getName() + "with " + getDimensions() +" (in m), with " + getWindows() + "and " + getNoOfChairs() + "chairs is already booked : " + getIsBooked();
	}

}