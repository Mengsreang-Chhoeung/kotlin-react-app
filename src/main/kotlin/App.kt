import react.RProps
import react.dom.*
import react.functionalComponent

external interface AppProps : RProps{
    var name: String
}

@JsExport
val App = functionalComponent<AppProps> { props ->
    h1 {
        + "Hello, ${props.name}"
    }
}