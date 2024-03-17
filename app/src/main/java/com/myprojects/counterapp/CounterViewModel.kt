package com.myprojects.counterapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class CounterViewModel: ViewModel() {
    private val _repository = CounterRepository()
    private var _count = mutableStateOf(_repository.getCounter().count)

    val count = _count
    fun increment() {
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decrement() {
        _count.value --
        _count.value = _repository.getCounter().count
    }
}

