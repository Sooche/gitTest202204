package dto;

import java.sql.Date;

public class Reply {
	private int rnum;
	private int bnum;
	private String content;
	private int relevel;
	private int restep;
	private Date regidate ;
	
	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRelevel() {
		return relevel;
	}
	public void setRelevel(int relevel) {
		this.relevel = relevel;
	}
	public int getRestep() {
		return restep;
	}
	public void setRestep(int restep) {
		this.restep = restep;
	}
	public Date getRegidate() {
		return regidate;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	@Override
	public String toString() {
		return "Reply [rnum=" + rnum + ", bnum=" + bnum + ", content=" + content + ", relevel=" + relevel + ", restep="
				+ restep + ", regidate=" + regidate + "]";
	}
	
	
}
