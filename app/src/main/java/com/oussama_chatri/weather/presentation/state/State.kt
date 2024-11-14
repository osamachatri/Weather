package com.oussama_chatri.weather.ui.state

import kotlinx.serialization.Serializable

@Serializable
sealed interface State {

    @Serializable
    data object Initial : State

    @Serializable
    data object Loading : State

    @Serializable
    data object Success : State

    @Serializable
    data object Error : State
}