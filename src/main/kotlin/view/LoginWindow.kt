package view

import org.uqbar.arena.kotlin.extensions.text
import org.uqbar.arena.kotlin.extensions.width
import org.uqbar.arena.kotlin.extensions.with
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.ErrorsPanel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import viewModel.SpotifyMV

class LoginWindow (owner: WindowOwner, var  model: SpotifyMV): SimpleWindow<SpotifyMV>(owner, model)  {


    override fun createFormPanel(mainPanel: Panel?) {
        title = "Login"
        ErrorsPanel(mainPanel,"no tira error")
    }

    override fun addActions(p0: Panel?) {
        Button(p0) with {
            text = "Login"
            width = 250
        }
    }
}