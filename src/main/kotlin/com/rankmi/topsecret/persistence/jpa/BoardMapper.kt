package com.rankmi.topsecret.persistence.jpa

import com.rankmi.topsecret.domain.Board
import org.springframework.stereotype.Component

@Component
class BoardMapper {
    fun mapToDomainEntity(entity: BoardEntity) : Board{
        return Board(entity.id, entity.name, entity.description)
    }

    fun mapToJPAEntity(board: Board): BoardEntity{
        return BoardEntity(board.id, board.name, board.description)
    }
}