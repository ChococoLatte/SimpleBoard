package com.example.simple_board.service;

import com.example.simple_board.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    void save(BoardDTO boardDTO);
    List<BoardDTO> getAll();
    BoardDTO getById(int id);
}
