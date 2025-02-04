package com.example.simple_board.controller;

import com.example.simple_board.dto.BoardDTO;
import com.example.simple_board.service.BoardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardServiceImpl boardService;

    @GetMapping("/list")
    public String getAll(Model model){
        List<BoardDTO> boardDTOList = boardService.getAll();
        model.addAttribute("boardDTOList",boardDTOList);
        return "list";
    }

    @GetMapping("/save")
    public String save(){
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO) {
        boardService.save(boardDTO);
        return "save";
    }
}
