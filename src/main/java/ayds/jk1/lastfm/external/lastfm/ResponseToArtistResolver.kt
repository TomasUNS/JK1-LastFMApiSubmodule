package ayds.jk1.lastfm.external.lastfm

import ayds.jk1.lastfm.external.Artist
import ayds.jk1.lastfm.external.LastFMSong

interface ResponseToArtistResolver {

    fun getArtistFromExternalData (serviceData: String, song: LastFMSong): Artist

}