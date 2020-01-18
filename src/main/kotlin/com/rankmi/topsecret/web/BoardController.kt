package com.rankmi.topsecret.web

import com.rankmi.topsecret.application.service.CreateBoardService
import com.rankmi.topsecret.application.service.GetAllBoardsService
import com.rankmi.topsecret.domain.Board
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/boards")
class BoardController(private val getAllBoardsService: GetAllBoardsService,
                      private val createBoardService: CreateBoardService) {
    @GetMapping
    fun getAllBoards(): List<Board> {
        return getAllBoardsService.getBoards()
    }

    @PostMapping
    fun createBoard(@RequestBody board: Board): Board {
        return createBoardService.createBoard(board)
    }

}