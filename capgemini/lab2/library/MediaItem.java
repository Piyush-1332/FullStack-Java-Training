package capgemini.lab2.library;

public abstract class MediaItem extends Item {
	String CD_TYPE, VIDEO_TYPE;
	int CD_ID, VIDEO_ID;

	public String getCD_TYPE() {
		return CD_TYPE;
	}

	public void setCD_TYPE(String cD_TYPE) {
		CD_TYPE = cD_TYPE;
	}

	public String getVIDEO_TYPE() {
		return VIDEO_TYPE;
	}

	public void setVIDEO_TYPE(String vIDEO_TYPE) {
		VIDEO_TYPE = vIDEO_TYPE;
	}

	public int getCD_ID() {
		return CD_ID;
	}

	public void setCD_ID(int cD_ID) {
		CD_ID = cD_ID;
	}

	public int getVIDEO_ID() {
		return VIDEO_ID;
	}

	public void setVIDEO_ID(int vIDEO_ID) {
		VIDEO_ID = vIDEO_ID;
	}
	public abstract void cdQuality();
	public abstract void videoQuality();

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}
