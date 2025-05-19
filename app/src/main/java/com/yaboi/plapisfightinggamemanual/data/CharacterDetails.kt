package com.yaboi.plapisfightinggamemanual.data

import android.os.Parcel
import android.os.Parcelable

data class CharacterDetails(
    val id: String,
    val name: String,
    val playstyle: String,
    val strengths: List<String>,
    val weaknesses: List<String>,
    val moves: Map<MoveType, List<Move>>
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.createStringArrayList() ?: listOf(),
        parcel.createStringArrayList() ?: listOf(),
        readMoveMap(parcel)
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(name)
        parcel.writeString(playstyle)
        parcel.writeStringList(strengths)
        parcel.writeStringList(weaknesses)
        writeMoveMap(parcel, moves)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CharacterDetails> {
        override fun createFromParcel(parcel: Parcel): CharacterDetails {
            return CharacterDetails(parcel)
        }

        override fun newArray(size: Int): Array<CharacterDetails?> {
            return arrayOfNulls(size)
        }

        private fun readMoveMap(parcel: Parcel): Map<MoveType, List<Move>> {
            val size = parcel.readInt()
            val map = mutableMapOf<MoveType, List<Move>>()
            repeat(size) {
                val typeString = parcel.readString() ?: MoveType.NORMAL.name
                val type = try {
                    MoveType.valueOf(typeString)
                } catch (e: IllegalArgumentException) {
                    MoveType.NORMAL // Fallback to NORMAL if type can't be parsed
                }
                val moves = mutableListOf<Move>()
                parcel.readTypedList(moves, Move.CREATOR)
                map[type] = moves
            }
            return map
        }

        private fun writeMoveMap(parcel: Parcel, map: Map<MoveType, List<Move>>) {
            parcel.writeInt(map.size)
            map.forEach { (type, moves) ->
                parcel.writeString(type.name)
                parcel.writeTypedList(moves)
            }
        }
    }
} 