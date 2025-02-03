package com.example.simple_board.service;

import com.example.simple_board.dto.BoardDTO;
import com.example.simple_board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO){
        boardRepository.save(boardDTO);
    }
}
