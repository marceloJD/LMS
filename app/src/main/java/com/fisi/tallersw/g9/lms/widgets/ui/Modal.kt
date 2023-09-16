package com.fisi.tallersw.g9.lms.widgets.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@ExperimentalMaterial3Api()
@Composable
fun BottomModal(
    opened: MutableState<Boolean>,
    content: @Composable() () -> Unit
) {
    val modalSheetState = rememberModalBottomSheetState()
    var showModal by remember { mutableStateOf(opened.value) }

    if (!showModal) return;

    ModalBottomSheet(
        onDismissRequest = { showModal = false },
        sheetState = modalSheetState
    ) {
        content()
    }
}
