package components.shared

import react.*
import react.dom.*

external interface ButtonProps : RProps{
    var onClick: () -> Unit
}

val Button = functionalComponent<ButtonProps> { props ->
    button {
        attrs {

        }
    }
}