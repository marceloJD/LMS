package com.fisi.tallersw.g9.lms.widgets

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fisi.tallersw.g9.lms.courseicon.IconName
import com.fisi.tallersw.g9.lms.coursetitle.CourseTitle

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun CourseHeader() {
    Column {
        CourseTitle(
            courseIcon = IconName.BookAlt,
            courseName = "Taller de construcción",
            modifier = Modifier.height(180.dp)
        )
        Spacer(modifier = Modifier.height(64.dp))
        ProgressCard(classProgress = 0.34f, nextClassDate = "20-10-2023")
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun Preview2(){
    CourseHeader()
}