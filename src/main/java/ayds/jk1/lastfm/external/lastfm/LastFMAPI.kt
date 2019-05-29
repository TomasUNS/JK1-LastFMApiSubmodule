package ayds.jk1.lastfm.external.lastfm

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LastFMAPI {

    @GET("?method=artist.getinfo&api_key=0a657854db69e551c97d541ca9ebcef4")
    fun getArtistInfo(@Query("artist") artist: String): Call<String>

}