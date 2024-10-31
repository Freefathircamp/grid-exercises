package lat.pam.gridexercises.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId : Int,
    val valueResource : Int,
    @DrawableRes val imageResourceId : Int,
)