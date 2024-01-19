package com.teamsparta.todo.domain.card.controller

import com.teamsparta.todo.domain.card.dto.CardResponse
import com.teamsparta.todo.domain.card.dto.CreateCardRequest
import com.teamsparta.todo.domain.card.dto.UpdateCardRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/cards")
@RestController
class CardController {

    @GetMapping("/{cardId}")
    fun getCard(@PathVariable cardId: Long): ResponseEntity<CardResponse>{
        TODO("not implemented")
    }

    @GetMapping()
    fun getCardList(): ResponseEntity<List<CardResponse>>{
        TODO("not implemented")
    }

    @PostMapping
    fun createCard(@RequestBody createCardRequest: CreateCardRequest) : ResponseEntity<CardResponse>{
        TODO("not implemented")
    }

    @PutMapping("/{cardId}")
    fun updateCard(
            @PathVariable cardId: Long,
            @RequestBody updateCardRequest: UpdateCardRequest) : ResponseEntity<CardResponse>{
        TODO("not implemented")
    }

    @DeleteMapping("/{cardId}")
    fun deleteCard(@PathVariable cardId: Long) : ResponseEntity<Unit> {
        TODO("not implemented")
    }

}