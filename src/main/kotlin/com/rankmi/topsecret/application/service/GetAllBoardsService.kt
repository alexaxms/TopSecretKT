package com.rankmi.topsecret.application.service

import com.rankmi.topsecret.application.port.`in`.GetAllBoardsQuery
import com.rankmi.topsecret.application.port.out.LoadBoardsPort
import com.rankmi.topsecret.domain.Board
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class GetAllBoardsService: GetAllBoardsQuery {

    @Autowired
    private lateinit var loadBoardsPort: LoadBoardsPort
    override fun getBoards(): List<Board> {
        return loadBoardsPort.getBoards()
    }
}