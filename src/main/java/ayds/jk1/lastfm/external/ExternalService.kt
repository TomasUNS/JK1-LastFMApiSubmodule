package ayds.jk1.lastfm.external

interface ExternalService {

    fun getArtist (song: LastFMSong): Artist

}