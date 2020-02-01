package capgemini.lab2.library;

public abstract class WrittenItem extends Item {

	String BOOK_TYPE, JOURNAL_TYPE;
	int BOOK_ID, JOURNAL_ID;

	public int getBOOK_ID() {
		return BOOK_ID;
	}

	public void setBOOK_ID(int bOOK_ID) {
		BOOK_ID = bOOK_ID;
	}

	public int getJOURNAL_ID() {
		return JOURNAL_ID;
	}

	public void setJOURNAL_ID(int jOURNAL_ID) {
		JOURNAL_ID = jOURNAL_ID;
	}

	public String getBOOK_TYPE() {
		return BOOK_TYPE;
	}

	public void setBOOK_TYPE(String bOOK_TYPE) {
		BOOK_TYPE = bOOK_TYPE;
	}

	public String getJOURNAL_TYPE() {
		return JOURNAL_TYPE;
	}

	public void setJOURNAL_TYPE(String jOURNAL_TYPE) {
		JOURNAL_TYPE = jOURNAL_TYPE;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
	}
	public abstract void bookQuality();
	public abstract void journalQuality();
}
