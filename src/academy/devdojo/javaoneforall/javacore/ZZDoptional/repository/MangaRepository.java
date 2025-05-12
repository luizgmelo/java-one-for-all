package academy.devdojo.javaoneforall.javacore.ZZDoptional.repository;

import academy.devdojo.javaoneforall.javacore.ZZDoptional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = new ArrayList<>(
            List.of(new Manga(1, "Attack on Titan", 12),
                    new Manga(2, "Boku no hero", 23),
                    new Manga(3, "Demon Slayer", 24))
    );

    public static Optional<Manga> findById(Integer id) {
        return findBy(m-> m.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        for (Manga currentManga : mangas) {
            if (predicate.test(currentManga)) {
                return Optional.of(currentManga);
            }
        }
        return Optional.empty();
    }
}
