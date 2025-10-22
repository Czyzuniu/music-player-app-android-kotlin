package com.example.abelandcoleandroidnativeapp.core.designsystem.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.abelandcoleandroidnativeapp.R

val StagFontRegular = FontFamily(
    Font(R.font.stag_body, FontWeight.Normal),
)

val StagFontRegularBold = FontFamily(
    Font(R.font.stag_body_bold, FontWeight.Normal),
)

val StagFontLight = FontFamily(
    Font(R.font.stag_light, FontWeight.Normal),
)

val ApplesAndCarrots = FontFamily(
    Font(R.font.applesandcarrots, FontWeight.Normal),
)

object AppTextStyles {

    val TitleOne = TextStyle(fontFamily = ApplesAndCarrots, fontSize = TextSizes.XXL)
    val TitleTwo = TextStyle(fontFamily = ApplesAndCarrots, fontSize = TextSizes.XL)
    val TitleThree = TextStyle(fontFamily = ApplesAndCarrots, fontSize = TextSizes.L)
    val TitleFour = TextStyle(fontFamily = ApplesAndCarrots, fontSize = TextSizes.ML)
    val TitleFive = TextStyle(fontFamily = ApplesAndCarrots, fontSize = TextSizes.M)
    val TitleSix = TextStyle(fontFamily = ApplesAndCarrots, fontSize = TextSizes.S)
    val TitleSeven = TextStyle(fontFamily = ApplesAndCarrots, fontSize = TextSizes.XS)

    val BodyText = TextStyle(fontFamily = StagFontRegular, fontSize = TextSizes.MS)
    val BodyTextBold = TextStyle(fontFamily = StagFontRegularBold, fontSize = TextSizes.MS)
    val SmallText = TextStyle(fontFamily = StagFontRegular, fontSize = TextSizes.S)
    val SmallTextBold = TextStyle(fontFamily = StagFontRegularBold, fontSize = TextSizes.S)
    val VerySmallText = TextStyle(fontFamily = StagFontRegular, fontSize = TextSizes.XS)
    val VerySmallTextBold = TextStyle(fontFamily = StagFontRegularBold, fontSize = TextSizes.XS)
    val LargeText = TextStyle(fontFamily = StagFontRegular, fontSize = TextSizes.M)
    val LargeTextBold = TextStyle(fontFamily = StagFontRegularBold, fontSize = TextSizes.M)
    val VeryLargeText = TextStyle(fontFamily = StagFontRegular, fontSize = TextSizes.ML)
    val VeryLargeTextBold = TextStyle(fontFamily = StagFontRegularBold, fontSize = TextSizes.ML)
    val ExtraLargeText = TextStyle(fontFamily = StagFontRegular, fontSize = TextSizes.L)
    val ExtraLargeTextBold = TextStyle(fontFamily = StagFontRegularBold, fontSize = TextSizes.L)

}


sealed class HeadingStyle(val textStyle: TextStyle) {
    object TitleOne : HeadingStyle(AppTextStyles.TitleOne)
    object TitleTwo : HeadingStyle(AppTextStyles.TitleTwo)
    object TitleThree : HeadingStyle(AppTextStyles.TitleThree)
    object TitleFour : HeadingStyle(AppTextStyles.TitleFour)
    object TitleFive : HeadingStyle(AppTextStyles.TitleFive)
    object TitleSix : HeadingStyle(AppTextStyles.TitleSix)
    object TitleSeven : HeadingStyle(AppTextStyles.TitleSeven)
}

sealed class BodyTextStyle(val textStyle: TextStyle) {
    object BodyText : BodyTextStyle(AppTextStyles.BodyText)
    object BodyTextBold : BodyTextStyle(AppTextStyles.BodyTextBold)
    object SmallText : BodyTextStyle(AppTextStyles.SmallText)
    object SmallTextBold : BodyTextStyle(AppTextStyles.SmallTextBold)
    object VerySmallText : BodyTextStyle(AppTextStyles.VerySmallText)
    object VerySmallTextBold : BodyTextStyle(AppTextStyles.VerySmallTextBold)
    object LargeText : BodyTextStyle(AppTextStyles.LargeText)
    object LargeTextBold : BodyTextStyle(AppTextStyles.LargeTextBold)
    object VeryLargeText : BodyTextStyle(AppTextStyles.VeryLargeText)
    object VeryLargeTextBold : BodyTextStyle(AppTextStyles.VeryLargeTextBold)
    object ExtraLargeText : BodyTextStyle(AppTextStyles.ExtraLargeText)
    object ExtraLargeTextBold : BodyTextStyle(AppTextStyles.ExtraLargeTextBold)
}