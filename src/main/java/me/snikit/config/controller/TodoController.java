package me.snikit.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.snikit.entity.Todo;
import me.snikit.repo.TodoRepo;

@RestController
public class TodoController {

	@Autowired
	private TodoRepo todoRepo;
	
//	/todo?page=1&size=5
	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public Page<Todo> seePage(Pageable pageRequest) {
		return todoRepo.findAll(pageRequest);
	}

}
