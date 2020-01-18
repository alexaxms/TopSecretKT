package com.rankmi.topsecret.application.service

import com.rankmi.topsecret.application.port.`in`.CreateBoardUsecase
import com.rankmi.topsecret.application.port.out.SaveBoardPort
import com.rankmi.topsecret.domain.Board
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CreateBoardService: CreateBoardUsecase {

    @Autowired
    private lateinit var saveBoardPort : SaveBoardPort

    override fun createBoard(board: Board): Board{
        return saveBoardPort.save(board)
    }
}