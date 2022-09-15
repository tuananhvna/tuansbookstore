package com.example.tuansbookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
	@RequestMapping("/index")
	public String index(@RequestParam(name = "title") String title, @RequestParam(name = "ibsn") String ibsn) {
		return "You search for the book " + title + " " + ibsn + "!";
	}
}
