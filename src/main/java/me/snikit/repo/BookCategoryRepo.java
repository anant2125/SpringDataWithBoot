package me.snikit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import me.snikit.dto.CustomDTO;
import me.snikit.entity.BookCategory;

@Repository
public interface BookCategoryRepo extends PagingAndSortingRepository<BookCategory, Integer> {

	@Query("select new me.snikit.dto.CustomDTO(c.name) from Book b  left join b.bookCategory c where b.id=:id")
	List<CustomDTO> getNameForId(@Param("id") int id);

	@Query(value = "select id from Book", nativeQuery = true)
	List<Integer> getAllBooks();

	// List<Customer> findByLastName(String lastName);

	// List<Customer> findByLastNameStartsWith(String lastName);

	// List<Customer> findByLastNameOrderByFirstName(String lname);

	// List<Customer> findByLastNameOrFirstName(String lname, String fname);

	// int countByLastNameIgnoreCase(String lname);

	// int countByLastNameContainingIgnoreCase(String lname);

	// @Query("SELECT c from Customer c where LOWER(c.firstName) =

	// LOWER(:fname)")

	// Customer findByCustomQuery(@Param("fname") String fname);

	// findDistinctCustomerBy whatever

	// AllIgnoreCase

	// OrderBy attribute - asc ,desc

	// findByadressName

}
