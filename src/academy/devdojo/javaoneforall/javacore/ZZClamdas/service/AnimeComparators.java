package academy.devdojo.javaoneforall.javacore.ZZClamdas.service;

import academy.devdojo.javaoneforall.javacore.ZZClamdas.domain.Anime;
// Method Reference static methods
public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }
    public static int compareByEpisodes(Anime a1, Anime a2) {

        return Integer.compare(a2.getEpisodes(), a1.getEpisodes());
    }

    public int compareByEpisodesNonStatic(Anime a1, Anime a2) {

        return Integer.compare(a2.getEpisodes(), a1.getEpisodes());
    }
}
