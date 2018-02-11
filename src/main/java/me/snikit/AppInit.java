package me.snikit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import me.snikit.entity.Book;
import me.snikit.entity.BookCategory;
import me.snikit.entity.Todo;
import me.snikit.repo.BookCategoryRepo;
import me.snikit.repo.TodoRepo;

@SpringBootApplication
public class AppInit implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(AppInit.class);

	@Autowired
	private BookCategoryRepo bookCategoryRepository;

	@Autowired
	private TodoRepo todoRepo;

	public static void main(String[] args) {
		SpringApplication.run(AppInit.class, args);
	}

	@Override
	@Transactional
	public void run(String... strings) throws Exception {

		List<Todo> todos = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			todos.add(new Todo("todo no " + i, "something meaningfull with detail no" + i));
		}

		todoRepo.save(todos);

		// save a couple of categories
		BookCategory categoryA = new BookCategory("Category A");
		Set bookAs = new HashSet<Book>() {
			{
				add(new Book("Book A1", categoryA));
				add(new Book("Book A2", categoryA));
				add(new Book("Book A3", categoryA));
			}
		};
		categoryA.setBooks(bookAs);

		BookCategory categoryB = new BookCategory("Category B");
		Set bookBs = new HashSet<Book>() {
			{
				add(new Book("Book B1", categoryB));
				add(new Book("Book B2", categoryB));
				add(new Book("Book B3", categoryB));
			}
		};
		categoryB.setBooks(bookBs);

		bookCategoryRepository.save(new HashSet<BookCategory>() {
			{
				add(categoryA);
				add(categoryB);
			}
		});

	}
}