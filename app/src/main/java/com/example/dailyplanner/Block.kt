package com.example.dailyplanner

data class Block(val imageId:Int, val title:String, val description:String)
class BlockList{val list = arrayListOf(
    Block(R.drawable.block1, "Заголовок блока", "Краткое описание\nс двумя строчками"),
    Block(R.drawable.block2, "Заголовок блока", "Краткое описание\nс двумя строчками"),
    Block(R.drawable.block3, "Заголовок блока", "Краткое описание\nс двумя строчками"),
    Block(R.drawable.block1, "Заголовок блока", "Краткое описание\nс двумя строчками"),
    Block(R.drawable.block2, "Заголовок блока", "Краткое описание\nс двумя строчками"),
    Block(R.drawable.block3, "Заголовок блока", "Краткое описание\nс двумя строчками"))}
