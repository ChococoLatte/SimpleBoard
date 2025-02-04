package com.example.simple_board.service;

import com.example.simple_board.dto.BoardDTO;
import com.example.simple_board.repository.BoardRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepositoryImpl boardRepository;

    @Override
    public void save(BoardDTO boardDTO){
        boardRepository.save(boardDTO);
    }

    @Override
    public List<BoardDTO> getAll(){
        return boardRepository.getAll();
    }

    @Override
    public BoardDTO getById(int id){
        return boardRepository.getById(id);
    }
}
