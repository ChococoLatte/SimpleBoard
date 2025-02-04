package com.example.simple_board.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardMapper {

    void save(
            @Param("boardTitle") String boardTitle,
            @Param("boardWriter") String boardWriter,
            @Param("boardPass") String boardPass,
            @Param("boardContents") String boardContents
    );
}
