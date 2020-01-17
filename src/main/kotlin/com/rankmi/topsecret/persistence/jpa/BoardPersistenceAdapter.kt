package com.rankmi.topsecret.persistence.jpa

import com.rankmi.topsecret.application.port.out.LoadBoardsPort
import com.rankmi.topsecret.domain.Board
import org.springframework.stereotype.Component

@Component
class BoardPersistenceAdapter(private val boardRepository: BoardRepository,
                              private val boardMapper: BoardMapper) : LoadBoardsPort{
    override fun getBoards(): List<Board> {
        val boards = boardRepository.findAll()
        return boards.map { boardMapper.mapToDomainEntity(it) }
    }
}