package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Reply;

@Mapper
public interface ReplyDao {

	@Select("SELECT r.rid, r.content, r.regDate, r.isMine, r.uid, r.genBid, u.uname "
			+ "	FROM reply AS r"
			+ "	JOIN users AS u"
			+ "	ON r.uid=u.uid"
			+ "	WHERE genBid=#{genBid}")
	public List<Reply> getReplyList(int genBid);
	
	@Insert("INSERT INTO reply"
			+ " VALUES (default, #{content}, default, #{isMine}, #{uid}, #{genBid})")
	public void insertReply(Reply reply);
	
}
