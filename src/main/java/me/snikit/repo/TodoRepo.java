package me.snikit.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import me.snikit.entity.Todo;

@Repository
public interface TodoRepo extends PagingAndSortingRepository<Todo, Long> {

	
	
}
