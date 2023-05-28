package com.lorrained.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lorrained.bookclub.models.Book;
import com.lorrained.bookclub.models.User;
import com.lorrained.bookclub.services.BookService;
import com.lorrained.bookclub.services.UserService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private UserService userServ;
	@Autowired
	private BookService bookServ;
	
	
	/////BOOK DASHBOARD/////
	@GetMapping("")
	public String books(Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		Long id = (Long) session.getAttribute("userId");
		User loggedUser = userServ.findById(id);
		model.addAttribute("user", loggedUser);
		model.addAttribute("allBooks", bookServ.allBooks() );
		return "books.jsp";
	}
	
	
	/////SHOW ONE BOOK/////
	@GetMapping("/{id}")
	public String bookPage(@PathVariable("id") Long id, Model model) {
		model.addAttribute("book", bookServ.findBook(id));
		return "book.jsp";
	}
	
	
	/////EDIT ONE BOOK/////
	@GetMapping("/edit/{id}")
	public String editBook(@PathVariable("id") Long id, Model model) {
		model.addAttribute("book", bookServ.findBook(id));
        return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String edit(@Valid @ModelAttribute("book") Book book, BindingResult result, @PathVariable("id") Long id) {
        if (result.hasErrors()) {
            return "newbook.jsp";
        } else {
        	book.setId(id);
            bookServ.updateBook(book);
            return "redirect:/books";
        }
	}
	
	
	/////CREATE NEW BOOK/////
	@GetMapping("/new")
	public String newBook(@ModelAttribute("book") Book book) {		
		return "newbook.jsp";
	}
	
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
		Long id = (Long) session.getAttribute("userId");
		User loggedUser = userServ.findById(id);
		book.setUser(loggedUser);
        if (result.hasErrors()) {
            return "newbook.jsp";
        } else {
            bookServ.createBook(book);
            return "redirect:/books";
        }
	}
	
	
	
}
