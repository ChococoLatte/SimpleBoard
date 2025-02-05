package com.example.simple_board.repository;

import com.example.simple_board.dto.BoardDTO;

import java.util.List;

public interface BoardRepository {
    void save(BoardDTO boardDTO);
    List<BoardDTO> getAll();
    BoardDTO getById(int id);
    void updateById(int id, BoardDTO boardDTO);
    void delete(int id);
}
