package dto;

import java.util.Date;

public class Board {
	private int bnum;
	private String userid;
	private String subject;
	private String content;
	private int readcnt;
	private String ip;
	private Date regidate;
	public Board() {
		super();
	}
	public Board(int bnum, String userid, String subject, String content, int readcnt, String ip, Date regidate) {
		super();
		this.bnum = bnum;
		this.userid = userid;
		this.subject = subject;
		this.content = content;
		this.readcnt = readcnt;
		this.ip = ip;
		this.regidate = regidate;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getRegidate() {
		return regidate;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	@Override
	public String toString() {
		return "Board [bnum=" + bnum + ", userid=" + userid + ", subject=" + subject + ", content=" + content
				+ ", readcnt=" + readcnt + ", ip=" + ip + ", regidate=" + regidate + "]";
	}
	
}
