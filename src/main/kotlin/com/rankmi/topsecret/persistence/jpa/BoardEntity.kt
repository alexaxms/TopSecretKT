package com.rankmi.topsecret.persistence.jpa

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class BoardEntity (
        @Id
        @GeneratedValue
        val id: Long = 0,

        @Column
        val name: String = "",

        @Column
        val description: String = ""
)