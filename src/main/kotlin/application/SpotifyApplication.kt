package application




import org.github.unqui.getSpotifyService
import org.uqbar.arena.Application
import org.uqbar.arena.windows.Window
import view.LoginWindow
import viewModel.SpotifyMV


class SpotifyApplication: Application() {
    val system = getSpotifyService()

    override fun createMainWindow(): Window<*> {
       // system.register("Jon Snow", "jon@snow.com", "ghost", "https://bit.ly/3496Vje")
        return LoginWindow(this, SpotifyMV(system))
    }
}

fun main() {
    SpotifyApplication().start()
}
class Main {
}