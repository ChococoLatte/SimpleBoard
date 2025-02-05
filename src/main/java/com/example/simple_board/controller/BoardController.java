package com.example.simple_board.controller;

import com.example.simple_board.dto.BoardDTO;
import com.example.simple_board.service.BoardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardServiceImpl boardServiceImpl;

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        boardServiceImpl.delete(id);
        return "redirect:/list";
    }

    @DeleteMapping("/update/{id}")
    public String update(@PathVariable int id, @ModelAttribute BoardDTO boardDTO, Model model){
        model.addAttribute("id", id);
        model.addAttribute("boardUpdate", boardDTO);
        return "update";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable int id, @ModelAttribute BoardDTO boardDTO){
        boardServiceImpl.updateById(id,boardDTO);
        return "redirect:/list";
    }

    @GetMapping("/list/{id}")
    public String detail(@PathVariable int id, Model model){
        BoardDTO boardDetail = boardServiceImpl.getById(id);
        model.addAttribute("id", id);
        model.addAttribute("boardDetail", boardDetail);
        return "detail";
    }

    @GetMapping("/list")
    public String getAll(Model model){
        List<BoardDTO> boardList = boardServiceImpl.getAll();
        model.addAttribute("boardList",boardList);
        return "list";
    }

    @GetMapping("/save")
    public String save(){
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO) {
        boardServiceImpl.save(boardDTO);
        return "save";
    }
}
