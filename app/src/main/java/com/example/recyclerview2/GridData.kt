package com.example.recyclerview2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GridData (
    var id:Int,
    var title1:String

) : Parcelable
