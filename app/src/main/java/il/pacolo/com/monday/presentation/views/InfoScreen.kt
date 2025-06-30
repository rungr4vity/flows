package il.pacolo.com.monday.presentation.views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import il.pacolo.com.monday.presentation.viewmodels.InfoViewModel


@Composable
fun InfoScreen(viewModel: InfoViewModel) {

    Row(Modifier.fillMaxSize()) {
        Button(onClick = {
            viewModel.getData()
        }) {
            Text(text = "Get Data")
        }
    }

}