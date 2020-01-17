package com.rankmi.topsecret.web

import com.rankmi.topsecret.application.service.GetAllBoardsService
import com.rankmi.topsecret.domain.Board
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/boards")
class BoardController(private val getAllBoardsService: GetAllBoardsService) {
    @GetMapping
    fun getAllBoards(): List<Board> {
        return getAllBoardsService.getBoards()
    }

}