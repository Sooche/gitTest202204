package dto;

public class Boardfile {
	private int bfnum;
	private int bnum;
	private String filename;
	public Boardfile() {
		super();
	}
	public Boardfile(int bfnum, int bnum, String filename) {
		super();
		this.bfnum = bfnum;
		this.bnum = bnum;
		this.filename = filename;
	}
	public int getBfnum() {
		return bfnum;
	}
	public void setBfnum(int bfnum) {
		this.bfnum = bfnum;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	@Override
	public String toString() {
		return "Boardfile [bfnum=" + bfnum + ", bnum=" + bnum + ", filename=" + filename + "]";
	}
	
}
