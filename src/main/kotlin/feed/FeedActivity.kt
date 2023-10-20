package feed

fun main() {
/*
        val posts = arrayListOf<Post>()
        (0..100).forEach {
            posts.add(
                Post(
                    id = it.toString(),
                    text = "Muri se la come ${it + 1} veces",
                    creator = Creator(
                        user = User(
                            fullName = "Daniel Garcia",
                            profilePicture = "https://randomuser.me/api/portraits/med/men/75.jpg"
                        )
                    ),
                    image = "https://images.dog.ceo/breeds/hound-afghan/n02088094_1128.jpg"
                )
            )
            posts.add(
                Post(
                    id = it.toString(),
                    text = "Description text ${it + 1} veces",
                    creator = Creator(
                        user = User(
                            fullName = "El Mister",
                            profilePicture = "https://randomuser.me/api/portraits/lego/6.jpg"
                        )
                    ),
                    image = "https://images.dog.ceo/breeds/hound-walker/n02089867_880.jpg"
                )
            )
        }
        recyclerView.adapter = FeedAdapter(
            posts = posts
        )
        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
    //getToken()

 */
}
/*
private fun getToken() {
    CoroutineScope(Dispatchers.IO).launch {
        val responseTokenUser: Response<UserResponse> = PostApi.retrofitService.registerUser(
            userRequest = UserRequest(
                email = "ybec.qxoxn9@pihey.com",
                password = "password1234"
            )
        ).execute()

        if (responseTokenUser.isSuccessful) {
            Log.i("FeedActivity", "Token user: ${responseTokenUser.body()?.token}")
            val responsePost: List<Post> = PostApi.retrofitService.getPost()

            if (responsePost.isNotEmpty()) {
                val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

                recyclerView.layoutManager = LinearLayoutManager(applicationContext) //this
                recyclerView.adapter = FeedAdapter(
                    posts = responsePost
                )
                recyclerView.addItemDecoration(
                    DividerItemDecoration(applicationContext, DividerItemDecoration.VERTICAL) //this
                )
            } else {
                Log.i("FeedActivity", "No tengo datos en responsePost")
            }
        }
    }
}

fun Adapter() {
    /* load img */
    fun bind(post: Post) {
        postTextView.text = post.text
        creatorTextView.text = post.creator.user.fullName

        post.creator.user.profilePicture?.let { profPicture ->
            val imgUri = profPicture.toUri().buildUpon().scheme("https").build()
            profilePicture.load(imgUri){
                placeholder(R.drawable.loading_animation)
                error(R.drawable.ic_broken)
            }
        }
    }
}

/* PostApiService */
private const val BASE_URL_POSTS = "https://topcars.dev/api/v1/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL_POSTS)
    /*.client(
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()
    )  */
    .build()

//private val token = "ea13b5c3f9f4ff45435d14fc1a222feaaa83137f"

data class UserRequest(
    @Json(name = "email") val email: String,
    @Json(name = "password") val password: String
)

data class UserResponse(@Json(name = "token") val token: String)

interface PostApiService {

    @GET("users/login")
    suspend fun registerUser(@Body userRequest: UserRequest): Call<UserResponse>

    @GET("api/v1/posts/")
    suspend fun getPost(): List<Post>
}

object PostApi {
    val retrofitService: PostApiService by lazy {
        retrofit.create(PostApiService::class.java)
    }
}
*/