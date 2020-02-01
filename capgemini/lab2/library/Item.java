package capgemini.lab2.library;

public abstract class Item {
	String BOOK_NAME,MUSCICD_NAME,JOURNAL_NAME,VIDEO_NAME;
	int BOOK_PRICE,MUSICCD_PRICE,JOURNAL_PRICE,VIDEO_PRICE;
	
	public String getJOURNAL_NAME() {
		return JOURNAL_NAME;
	}

	public void setJOURNAL_NAME(String jOURNAL_NAME) {
		JOURNAL_NAME = jOURNAL_NAME;
	}

	public String getVIDEO_NAME() {
		return VIDEO_NAME;
	}

	public void setVIDEO_NAME(String vIDEO_NAME) {
		VIDEO_NAME = vIDEO_NAME;
	}

	public int getJOURNAL_PRICE() {
		return JOURNAL_PRICE;
	}

	public void setJOURNAL_PRICE(int jOURNAL_PRICE) {
		JOURNAL_PRICE = jOURNAL_PRICE;
	}

	public int getVIDEO_PRICE() {
		return VIDEO_PRICE;
	}

	public void setVIDEO_PRICE(int vIDEO_PRICE) {
		VIDEO_PRICE = vIDEO_PRICE;
	}

	public String getBOOK_NAME() {
		return BOOK_NAME;
	}

	public void setBOOK_NAME(String bOOK_NAME) {
		BOOK_NAME = bOOK_NAME;
	}

	public String getMUSCICD_NAME() {
		return MUSCICD_NAME;
	}

	public void setMUSCICD_NAME(String mUSCICD_NAME) {
		MUSCICD_NAME = mUSCICD_NAME;
	}

	public int getBOOK_PRICE() {
		return BOOK_PRICE;
	}

	public void setBOOK_PRICE(int bOOK_PRICE) {
		BOOK_PRICE = bOOK_PRICE;
	}

	public int getMUSICCD_PRICE() {
		return MUSICCD_PRICE;
	}

	public void setMUSICCD_PRICE(int mUSICCD_PRICE) {
		MUSICCD_PRICE = mUSICCD_PRICE;
	}

	public abstract void show();
	
}
