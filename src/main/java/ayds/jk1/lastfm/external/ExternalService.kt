package ayds.jk1.lastfm.external

import ayds.spotisong.aurora.otherdetails.model.Artist
import ayds.spotisong.aurora.song.model.Song

interface ExternalService {

    fun getArtist (song: Song): Artist

}