package com.example.simple_board.repository;

import com.example.simple_board.dto.BoardDTO;
import com.example.simple_board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepository {

    private final BoardMapper boardMapper;

    @Override
    public void save(BoardDTO boardDTO){
        boardMapper.save(
                boardDTO.getBoardTitle(),
                boardDTO.getBoardWriter(),
                boardDTO.getBoardPass(),
                boardDTO.getBoardContents()
        );
    }
}
