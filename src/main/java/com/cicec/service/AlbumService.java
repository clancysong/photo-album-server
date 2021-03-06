package com.cicec.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cicec.pojo.Album;
import com.cicec.pojo.User;

public interface AlbumService {
public List<Album> getAlbumList(User user);
	
	public int addAlbum(Album album);
	
	public int removeAlbum(@Param("userId") int userId, @Param("albumId") int albumId);
}
