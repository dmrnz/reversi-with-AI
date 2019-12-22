package model.ai

import model.Chip

abstract class Player(internal open val chip: Chip) {

    fun oppositeChip(): Chip =
        if (chip == Chip.BLACK)
            Chip.WHITE
        else
            Chip.BLACK

    abstract fun play(board: List<List<Chip>>): Pair<Int, Int>
}