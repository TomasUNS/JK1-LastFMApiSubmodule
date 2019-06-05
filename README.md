# JK1-LastFMApiSubmodule

Esta libreria permite obtener la información del artista de una cancion. Esto incluye, su nombre (name, su biografia
(description), y un url a una imagen (pictureUrl). El submodulo contiene una clase Artist con estos tres elementos
String (la cual luego es adaptada a un objeto Card por el repositorio).

ExternalService es una clase con el metodo getArtist, la cual necesita dos parametros, una api creada con retrofit y
un objeto tipo responseToArtistSolver. El metodo getArtist, al recibir una cancion, retorna un objeto de tipo Artist
que contiene los tres componentes necesarios para LastFM a través del unico metodo de ResponseToArtistSolver.

getArtist recibe un elemento LastFMSong y retorna un Artist. Es el metodo utilizado por el repositorio para obtener
un artista.

ResponseToArtistSolver tiene el metodo getArtistFromExternalData, el cual es llamado desde ExternalService. Este
metodo se encarga de armar el componente Artista con su nombre, descripcion y url de la imagen.

LastFMSong es una clase similar a Song, que contiene los mismos parametros, y es utilizada por el submodulo.