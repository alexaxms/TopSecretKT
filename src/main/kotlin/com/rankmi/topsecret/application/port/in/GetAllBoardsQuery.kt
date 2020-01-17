package com.rankmi.topsecret.application.port.`in`

import com.rankmi.topsecret.domain.Board

interface GetAllBoardsQuery {
    fun getBoards(): List<Board>
}