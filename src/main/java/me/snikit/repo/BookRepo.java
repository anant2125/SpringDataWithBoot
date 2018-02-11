package me.snikit.repo;

import org.springframework.data.repository.CrudRepository;

import me.snikit.entity.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {

	Book findTopByNameContainingIgnoreCase(String name);

}
