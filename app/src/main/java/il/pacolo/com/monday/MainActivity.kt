package il.pacolo.com.monday


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider
import il.pacolo.com.monday.presentation.viewmodels.InfoViewModel
import il.pacolo.com.monday.presentation.views.InfoScreen

import il.pacolo.com.monday.presentation.views.PostScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val infoViewModel = ViewModelProvider(this)[InfoViewModel::class.java]



        enableEdgeToEdge()
        setContent {
        //PostScreen()
        InfoScreen(infoViewModel)

        }
    }
}


// 1 add retrofit
// 2 add internet permisson manifest
// 3 create a data/model  data/api
// create a data class named Post
// create a api interface named ApiService (retrofit get suspend function
// create retrofit instance
// create the viewmodel
// create post Screen
// add the viewMdel implementation

