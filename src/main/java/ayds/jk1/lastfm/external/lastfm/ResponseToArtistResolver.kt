package ayds.jk1.lastfm.external.lastfm

import ayds.spotisong.aurora.otherdetails.model.Artist
import ayds.spotisong.aurora.song.model.Song

interface ResponseToArtistResolver {

    fun getArtistFromExternalData (serviceData: String, song: Song): Artist

}