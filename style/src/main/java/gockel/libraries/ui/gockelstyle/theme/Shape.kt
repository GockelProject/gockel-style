package gockel.libraries.ui.gockelstyle.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(6.dp),
    large = RoundedCornerShape(12.dp)
)

object ExtraShapes {
    val pill = RoundedCornerShape(50)
}