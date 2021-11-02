package com.iu.b5.board.notice;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.iu.b5.board.BoardMapper;
//@Repository 생략가능
@Mapper
public interface NoticeMapper extends BoardMapper{

}
