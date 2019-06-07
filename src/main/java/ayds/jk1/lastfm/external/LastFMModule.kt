package ayds.jk1.lastfm.external

import ayds.jk1.lastfm.external.lastfm.ExternalServiceImp
import ayds.jk1.lastfm.external.lastfm.LastFMAPI
import ayds.jk1.lastfm.external.lastfm.ResponseToArtistResolver
import ayds.jk1.lastfm.external.lastfm.ResponseToArtistResolverImp
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object LastFMModule {

    private val retrofit = Retrofit.Builder ().baseUrl("http://ws.audioscrobbler.com/2.0/").addConverterFactory(ScalarsConverterFactory.create()).build()

    private val lastFMAPI = retrofit.create (LastFMAPI::class.java)

    private val responseToCardResolver: ResponseToArtistResolver = ResponseToArtistResolverImp ()

    fun service (): ExternalService {
        return ExternalServiceImp (lastFMAPI, responseToCardResolver)
    }

}