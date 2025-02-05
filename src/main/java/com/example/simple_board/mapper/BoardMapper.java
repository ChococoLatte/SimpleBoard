package com.example.simple_board.mapper;

import com.example.simple_board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {

    void save(
            @Param("boardTitle") String boardTitle,
            @Param("boardWriter") String boardWriter,
            @Param("boardPass") String boardPass,
            @Param("boardContents") String boardContents
    );

    List<BoardDTO> getAll();

    BoardDTO getById(int id);

    void updateById(int id,
                    @Param("boardTitle") String boardTitle,
                    @Param("boardWriter") String boardWriter,
                    @Param("boardContents") String boardContents
        );
}
