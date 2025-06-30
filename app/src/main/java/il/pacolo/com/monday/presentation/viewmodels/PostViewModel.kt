package il.pacolo.com.monday.presentation.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import il.pacolo.com.monday.data.api.ApiService
import il.pacolo.com.monday.data.api.RetrofitInstance
import il.pacolo.com.monday.data.models.Post
import il.pacolo.com.monday.data.repository.PostRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class PostViewModel(private val repository: PostRepository = PostRepository()): ViewModel() {

    //private val _uiState = MutableStateFlow<List<Post>>(emptyList())
    //val uiState: StateFlow<List<Post>> = _uiState.asStateFlow()





//    private fun fetchComments() {
//        viewModelScope.launch {
//                repository.getPosts()
//                    .catch { it.printStackTrace() }
//                    .collect {
//                    _uiState.value = it
//                }
//
//        }
    }



