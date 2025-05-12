package academy.devdojo.javaoneforall.javacore.ZZDoptional.test;


import academy.devdojo.javaoneforall.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.javaoneforall.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle(m.getTitle()+"2"));
        System.out.println(mangaByTitle.get().getTitle());

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(4, "Drifters", 20));
        System.out.println(newManga);
    }
}

