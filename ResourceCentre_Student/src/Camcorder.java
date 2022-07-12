
public class Camcorder extends Item{
private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		output += String.format("Asset tag: %-10s\n Description: %-10s \n Optical Zoom: %-10s", getAssetTag(), getDescription(), opticalZoom);
		return output;
	}
}

