package com.fisi.tallersw.g9.lms.utils

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

@RequiresApi(Build.VERSION_CODES.O)
fun getDaysUntil(dateString: String): Long {
    val dateFormatter = DateTimeFormatter.
    ofPattern("dd-MM-yyyy")

    return try {
        val inputDate = LocalDate.parse(dateString, dateFormatter)
        val today = LocalDate.now()
        ChronoUnit.DAYS.between(today, inputDate)
    } catch (e: Exception) {
        e.printStackTrace()
        -1
    }
}

