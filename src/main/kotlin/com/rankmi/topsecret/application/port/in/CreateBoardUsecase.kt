package com.rankmi.topsecret.application.port.`in`

import com.rankmi.topsecret.domain.Board

interface CreateBoardUsecase {
    fun createBoard(board: Board) : Board
}