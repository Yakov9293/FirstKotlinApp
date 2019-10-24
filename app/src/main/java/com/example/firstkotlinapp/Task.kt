package com.example.firstkotlinapp

import java.util.*

class Task(var name: String = "Заголовок задачи", description: String = "Описание задачи", date: Date = Date(2019), priority: Difficulty = Difficulty.MEDIUM)

enum class Difficulty {
    EASY, MEDIUM, HARD
}