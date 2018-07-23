package br.com.agmg.soapexample.client;

import java.util.List;

import br.com.agmg.soapexample.webservice.stubcode.Book;
import br.com.agmg.soapexample.webservice.stubcode.BookCatalog;
import br.com.agmg.soapexample.webservice.stubcode.BookCatalogService;

public class BookCatalogServiceTester {

	public static void main(String[] args) {
		
		BookCatalogService bookCatSrv = new BookCatalogService();
		BookCatalog bookCat = bookCatSrv.getBookCatalogPort();
		
		List<Book> lista  = bookCat.getBooks();
		lista.forEach(book -> System.out.println(book.getTitle()));
		
		
	}

}
