package academy.devdojo.javaoneforall.javacore.ZZClamdas.test;

import academy.devdojo.javaoneforall.javacore.ZZClamdas.domain.Anime;
import academy.devdojo.javaoneforall.javacore.ZZClamdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Method Reference non-static methods
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);
    }
}
