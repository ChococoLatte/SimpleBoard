package com.example.simple_board.repository;

import com.example.simple_board.dto.BoardDTO;

public interface BoardRepository {
    void save(BoardDTO boardDTO);
}
