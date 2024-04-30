package org.bytetech.joblisting.repository;

import org.bytetech.joblisting.model.Post;
import org.springframework.stereotype.Component;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}