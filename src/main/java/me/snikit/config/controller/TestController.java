package me.snikit.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.snikit.repo.BookCategoryRepo;
import me.snikit.repo.BookRepo;

@RestController
public class TestController {

	@Autowired
	private BookCategoryRepo bookCatRepo;

	@Autowired
	private BookRepo bookRepo;

	@GetMapping("/")
	public Object test() {

		System.out.println("-------------");
		System.out.println(bookCatRepo.findAll());
		System.out.println("-------------");
		System.out.println(bookRepo.findAll());
		System.out.println("-------------");
		System.out.println(bookCatRepo.getNameForId(2));
		System.out.println("-------------");
		System.out.println(bookCatRepo.getAllBooks());
		System.out.println("-------------");
		System.out.println(bookRepo.findTopByNameContainingIgnoreCase("book").getName());
		return "done ia m";
	}
}
