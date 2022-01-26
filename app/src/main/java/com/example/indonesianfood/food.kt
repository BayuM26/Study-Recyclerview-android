package com.example.indonesianfood

import android.os.Parcel
import android.os.Parcelable

data class food (
        var food_name: String? = null,
        var daerah_asal: String? = null,
        var imge_food: Int? = null,
        var FGenergi: String? = null,
        var FGprotein: String? = null,
        var FGbesi: String? = null,
        var FGlemak: String? = null,
        var FGserat: String? = null,
        var FGkalsium: String? = null,
        var FGvit_c: String? = null,
        var bahandasar: String? = null
    ) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(food_name)
        parcel.writeString(daerah_asal)
        parcel.writeValue(imge_food)
        parcel.writeString(FGenergi)
        parcel.writeString(FGprotein)
        parcel.writeString(FGbesi)
        parcel.writeString(FGlemak)
        parcel.writeString(FGserat)
        parcel.writeString(FGkalsium)
        parcel.writeString(FGvit_c)
        parcel.writeString(bahandasar)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<food> {
        override fun createFromParcel(parcel: Parcel): food {
            return food(parcel)
        }

        override fun newArray(size: Int): Array<food?> {
            return arrayOfNulls(size)
        }
    }

}