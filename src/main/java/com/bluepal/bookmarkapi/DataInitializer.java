package com.bluepal.bookmarkapi;

import com.bluepal.bookmarkapi.domain.Bookmark;
import com.bluepal.bookmarkapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer  implements CommandLineRunner {

    private final BookmarkRepository repository;


    @Override
    public void run(String... args) throws Exception {

        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
        repository.save(new Bookmark(null,"harithalabs","https://harithalabs", Instant.now()));
    }
}
