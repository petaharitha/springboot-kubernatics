package com.bluepal.bookmarkapi.domain;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository repository;
    @Transactional(readOnly=true)
    public List<Bookmark> getBookmarks(){
        return repository.findAll();
    }

}
