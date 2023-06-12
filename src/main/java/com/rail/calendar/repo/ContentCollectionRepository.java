package com.rail.calendar.repo;

import com.rail.calendar.model.Content;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.rail.calendar.model.Status.IDEA;
import static com.rail.calendar.model.Type.ARTICLE;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init() {
        Content content1 = new Content(1,
                "My First Blog Post",
                "My First blog post",
                IDEA,
                ARTICLE,
                LocalDateTime.now(),
                null,
                ""
        );
        contentList.add(content1);
    }

    public void save(Content content) {
        this.contentList.add(content);
    }
}
