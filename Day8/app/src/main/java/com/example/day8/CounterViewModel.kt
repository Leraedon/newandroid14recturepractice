package com.example.day8

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.day8.ui.theme.CounterRepository

class CounterViewModel(private val repository: CounterRepository): ViewModel() {
    private val _repository: CounterRepository = CounterRepository()
    private var _count = mutableStateOf(repository.getCounter().count)

    val count: MutableState<Int> = _count

    fun increment() {
        repository.incrementCounter()
        _count.value = repository.getCounter().count
    }

    fun decrement() {
        repository.incrementCounter()
        _count.value = repository.getCounter().count
    }
}