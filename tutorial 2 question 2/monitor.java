import java.util.*;

public class monitor{
	public int size; 

	ArrayList<dimension> dimensions = new ArrayList <dimension>(); 

	public monitor (int inSize, dimension inDimension){
		this.size = inSize;
		this.dimensions.add(inDimension);
	}

	public int getSize(){
		return size;
	}

	public ArrayList <dimension> getDimensions(){
		return dimensions;
	}

	public void setSize(int size){
		this.size = size;
	}

	public void setDimension (ArrayList<dimension> inDimension){
		this.dimensions = inDimension;
	}

	public String toString(){
		return " A monitor of " + getSize() + " inches and maximum resolution " + getDimensions() + " pixel";
	}
}