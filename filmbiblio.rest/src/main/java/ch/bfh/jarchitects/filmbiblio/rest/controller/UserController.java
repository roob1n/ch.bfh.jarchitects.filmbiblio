package ch.bfh.jarchitects.filmbiblio.rest.controller;

import ch.bfh.jarchitects.filmbiblio.service.UserService;
import ch.bfh.jarchitects.filmbiblio.service.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Collection;

@Controller
@RequestMapping("/movie")
public class UserController
{

	@Inject
	private UserService userService;

	/**
	 * Create
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public UserDTO createBook(@RequestBody UserDTO user) {
		UserDTO createdUser = userService.create(user);
		System.out.println("Book created with id = " + createdUser.getUserid());
		return createdUser;
	}

	/**
	 * ReadAll
	 */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Collection<UserDTO> getBooks() {
		System.out.println("Collection of Book requested");
		return userService.list();
	}

	/**
	 * Read
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody
	public UserDTO getBook(@PathVariable long id) {
		System.out.println("Book requested with id = " + id);
		return userService.read(id);
	}

	/**
	 * Update
	 */
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public UserDTO updateBook(@RequestBody UserDTO book) {
		UserDTO updatedBook = userService.update(book);
		System.out.println("Book updated with id = " + updatedBook.getUserid());
		return updatedBook;
	}

	/**
	 * Delete
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteBook(@PathVariable long id) {
		UserDTO book = userService.read(id);
		userService.delete(book);
		System.out.println("Delete Book with id = " + id);
	}
}
