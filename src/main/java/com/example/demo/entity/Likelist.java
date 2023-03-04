package com.example.demo.entity;

import java.time.LocalDateTime;

public class Likelist {
	private int likecount;
	private String uid;
	private int genBid;
	private int infoBid;
	private LocalDateTime likeTime;
	
	public Likelist() {}
	
	public Likelist(int likecount, String uid, int genBid, int infoBid, LocalDateTime likeTime) {
		super();
		this.likecount = likecount;
		this.uid = uid;
		this.genBid = genBid;
		this.infoBid = infoBid;
		this.likeTime = likeTime;
	}

	public int getLikecount() {
		return likecount;
	}

	public void setLikecount(int likecount) {
		this.likecount = likecount;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getGenBid() {
		return genBid;
	}

	public void setGenBid(int genBid) {
		this.genBid = genBid;
	}

	public int getInfoBid() {
		return infoBid;
	}

	public void setInfoBid(int infoBid) {
		this.infoBid = infoBid;
	}

	public LocalDateTime getLikeTime() {
		return likeTime;
	}

	public void setLikeTime(LocalDateTime likeTime) {
		this.likeTime = likeTime;
	}
	
	
}
