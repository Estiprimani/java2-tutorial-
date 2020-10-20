import java.util.*;

	public class computer{
		public String brand;

		ArrayList<harddisk>harddisks = new ArrayList <harddisk>();
		ArrayList<monitor>monitors = new ArrayList<monitor>();

		public computer(String inBrand, harddisk inHarddisk, monitor inMonitor){
			this.brand = inBrand;
			this.harddisks.add(inHarddisk);
			this.monitors.add(inMonitor);
		}

		public String getBrand(){
			return brand;
		}

		public ArrayList<harddisk> getHarddisks(){
			return harddisks;
		}

		public ArrayList<monitor> getMonitors(){
			return monitors;
		}

		public void setBrand(String brand){
			this.brand = brand;
		}

		public void setHarddisks (ArrayList <harddisk> inHarddisk){
			this.harddisks = inHarddisk;
		}

		public void setMonitors (ArrayList <monitor> inMonitor){
			this.monitors = inMonitor;
		}

		public String toString(){
			return getBrand() +" A " + getHarddisks() + " harddisk and a " + getMonitors();
		}

	}
