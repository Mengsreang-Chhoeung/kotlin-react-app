import kotlinx.browser.document
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledDiv

external interface AppProps : RProps{
    var name: String
}

data class AppState(
    var name: String
): RState

@JsExport
class App(props: AppProps) : RComponent<AppProps, AppState>(props) {

    init {
        state = AppState(name = props.name)
    }

    override fun RBuilder.render() {
        styledDiv {
            css {
                document.bgColor = "#FCF3CF"
                document.fgColor = "#333"
            }
        }
    }
}