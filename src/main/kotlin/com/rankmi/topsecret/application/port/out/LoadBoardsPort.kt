package com.rankmi.topsecret.application.port.out

import com.rankmi.topsecret.domain.Board

interface LoadBoardsPort {
    fun getBoards(): List<Board>
}