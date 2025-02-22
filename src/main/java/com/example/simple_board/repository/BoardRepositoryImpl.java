package com.example.simple_board.repository;

import com.example.simple_board.dto.BoardDTO;
import com.example.simple_board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public List<BoardDTO> getAll(){
        return boardMapper.getAll();
    }

    @Override
    public BoardDTO getById(int id){
        return boardMapper.getById(id);
    }

    @Override
    public void updateById(int id, BoardDTO boardDTO){
        boardMapper.updateById(id,boardDTO.getBoardTitle(), boardDTO.getBoardWriter(), boardDTO.getBoardContents());
    }

    @Override
    public void delete(int id){
        boardMapper.delete(id);
    }
}
