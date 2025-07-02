package il.pacolo.com.monday.data.repository

import il.pacolo.com.monday.data.api.RetrofitInstance
import il.pacolo.com.monday.data.models.Post
import il.pacolo.com.monday.utils.ResultState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

class PostRepository {

    fun getPosts(): Flow<ResultState<List<Post>>> =
         flow {
             emit(ResultState.Loading)
             RetrofitInstance.api.getPosts().let { posts ->
                 emit(ResultState.Success(posts))
             }.run {
                 emit(ResultState.Error("Unknown Error"))
             }

        }.catch { e ->
            emit(ResultState.Error(e.localizedMessage ?: "Unknown Error"))
         }

    }
