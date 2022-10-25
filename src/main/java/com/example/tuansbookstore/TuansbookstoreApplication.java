package com.example.tuansbookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.tuansbookstore.domain.Book;
import com.example.tuansbookstore.domain.BookRepository;

@SpringBootApplication
public class TuansbookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(TuansbookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TuansbookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner studentDemo(BookRepository repository) {
		return (args) -> {
			log.info("save some books");
			repository.save(new Book("000001", "The Notebook", "Nicholas Sparks", 1996, 20.0));
			repository.save(new Book("000002", "Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2011, 25.0));
			repository.save(new Book("000003", "Guns, Germs, and Steel", "Jared Diamond", 1997, 30.0));
			
			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
		};
	}
}
