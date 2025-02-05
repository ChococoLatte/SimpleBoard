package com.example.simple_board.service;

import com.example.simple_board.dto.BoardDTO;
import com.example.simple_board.repository.BoardRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepositoryImpl BoardRepositoryImpl;

    @Override
    public void save(BoardDTO boardDTO){
        BoardRepositoryImpl.save(boardDTO);
    }

    @Override
    public List<BoardDTO> getAll(){
        return BoardRepositoryImpl.getAll();
    }

    @Override
    public BoardDTO getById(int id){
        return BoardRepositoryImpl.getById(id);
    }

    @Override
    public void updateById(int id, BoardDTO boardDTO){
        BoardRepositoryImpl.updateById(id, boardDTO);
    }

}
