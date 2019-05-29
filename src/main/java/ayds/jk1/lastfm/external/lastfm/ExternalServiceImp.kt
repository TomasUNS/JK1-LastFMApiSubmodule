package ayds.jk1.lastfm.external.lastfm

import ayds.spotisong.aurora.otherdetails.model.Artist
import ayds.spotisong.aurora.otherdetails.model.repository.external.ExternalService
import ayds.spotisong.aurora.song.model.Song
import retrofit2.Response

internal class ExternalServiceImp (private val lastFMAPI: LastFMAPI, private val responseToArtistResolver: ResponseToArtistResolver): ExternalService {

    override fun getArtist (song: Song): Artist {
        val callResponse = getArtistFromService (song)
        return responseToArtistResolver.getArtistFromExternalData (callResponse.body () as String, song)
    }

    private fun getArtistFromService (song: Song): Response <String> {
        return lastFMAPI.getArtistInfo (song.artistName).execute ()
    }
}