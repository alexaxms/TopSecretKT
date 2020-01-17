package com.rankmi.topsecret.persistence.jpa

import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository: JpaRepository<BoardEntity, Long>