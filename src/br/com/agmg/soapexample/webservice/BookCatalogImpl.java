package br.com.agmg.soapexample.webservice;

import java.util.List;

import javax.jws.WebService;

import br.com.agmg.soapexample.businessservice.BookCatalogService;
import br.com.agmg.soapexample.model.Book;

@WebService(endpointInterface="br.com.agmg.soapexample.webservice.BookCatalog", portName="BookCatalogPort", serviceName="BookCatalogService")
public class BookCatalogImpl implements BookCatalog {

	
	private BookCatalogService bookCatalogService = new BookCatalogService();
	
	@Override
	public void addBook(Book newBook) {
		bookCatalogService.addBook(newBook);
	}

	@Override
	public Book getBook(String isbn) {
		return bookCatalogService.getBook(isbn);
	}

	@Override
	public List<Book> getBooks() {
		return bookCatalogService.getBooks();
	}

}
