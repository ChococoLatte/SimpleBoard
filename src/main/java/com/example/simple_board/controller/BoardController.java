package com.example.simple_board.controller;

import com.example.simple_board.dto.BoardDTO;
import com.example.simple_board.service.BoardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardServiceImpl boardService;

    @PostMapping("/save")
    public void save(@RequestBody BoardDTO boardDTO) {
        boardService.save(boardDTO);
    }
}
