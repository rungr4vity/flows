package il.pacolo.com.monday.data.api

import il.pacolo.com.monday.data.models.Post
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
     fun getPosts(): List<Post>

}