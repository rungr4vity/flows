package il.pacolo.com.monday.data.repository

import il.pacolo.com.monday.data.api.RetrofitInstance
import il.pacolo.com.monday.data.models.Post
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PostRepository {

    fun getPosts(): Flow<List<Post>> =
         flow {
            emit(RetrofitInstance.api.getPosts() as List<Post>)
        }

    }
