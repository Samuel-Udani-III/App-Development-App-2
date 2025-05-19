package com.yaboi.plapisfightinggamemanual.data

import android.os.Parcel
import android.os.Parcelable

data class Move(
    val id: String = "${System.currentTimeMillis()}_${(0..999999).random()}", // Unique ID for the move
    val name: String,
    val input: String,
    val description: String,
    val damage: Int,
    val startup: Int,
    val recovery: Int,
    val onBlock: Int,
    val type: MoveType,
    val properties: List<MoveProperty> = emptyList(),
    val counterHitEffect: String = "",
    val guardCrush: Boolean = false,
    val rcProperties: RomanCancelProperties? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        MoveType.valueOf(parcel.readString() ?: MoveType.NORMAL.name),
        parcel.createTypedArrayList(MoveProperty.CREATOR) ?: emptyList(),
        parcel.readString() ?: "",
        parcel.readBoolean(),
        parcel.readParcelable(RomanCancelProperties::class.java.classLoader)
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(name)
        parcel.writeString(input)
        parcel.writeString(description)
        parcel.writeInt(damage)
        parcel.writeInt(startup)
        parcel.writeInt(recovery)
        parcel.writeInt(onBlock)
        parcel.writeString(type.name)
        parcel.writeTypedList(properties)
        parcel.writeString(counterHitEffect)
        parcel.writeBoolean(guardCrush)
        parcel.writeParcelable(rcProperties, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Move> {
        override fun createFromParcel(parcel: Parcel): Move {
            return Move(parcel)
        }

        override fun newArray(size: Int): Array<Move?> {
            return arrayOfNulls(size)
        }
    }
}

data class MoveProperty(
    val name: String,
    val description: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MoveProperty> {
        override fun createFromParcel(parcel: Parcel): MoveProperty {
            return MoveProperty(parcel)
        }

        override fun newArray(size: Int): Array<MoveProperty?> {
            return arrayOfNulls(size)
        }
    }
}

data class RomanCancelProperties(
    val fastRcLevel: Int, // 1-3, indicating how good the move is for Fast RC
    val redRcLevel: Int,  // 1-3, indicating how good the move is for Red RC
    val purpleRcLevel: Int, // 1-3, indicating how good the move is for Purple RC
    val blueRcLevel: Int,   // 1-3, indicating how good the move is for Blue RC
    val rcNotes: String     // Additional RC-specific notes
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(fastRcLevel)
        parcel.writeInt(redRcLevel)
        parcel.writeInt(purpleRcLevel)
        parcel.writeInt(blueRcLevel)
        parcel.writeString(rcNotes)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RomanCancelProperties> {
        override fun createFromParcel(parcel: Parcel): RomanCancelProperties {
            return RomanCancelProperties(parcel)
        }

        override fun newArray(size: Int): Array<RomanCancelProperties?> {
            return arrayOfNulls(size)
        }
    }
} 