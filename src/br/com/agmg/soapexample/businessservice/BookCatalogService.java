package br.com.agmg.soapexample.businessservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.agmg.soapexample.model.Book;

public class BookCatalogService {
	
	private Map<String, Book> bookCatalog = new HashMap<String, Book>();
		
	public BookCatalogService() {

		bookCatalog.put("978-0-13-468599-1", new Book("Effective Java", "Third Edition", Arrays.asList(new String[]{"Joshua Block"}), 2018, "Addison-Wesley", "978-0-13-468599-1"));
		bookCatalog.put("0-596-00175-4", new Book("Java and SOAP", "Building Web Services com Java", Arrays.asList(new String[]{"Robert Englander"}), 2002, "O'Reilly", "0-596-00175-4"));
	}
	

	public void addBook(Book newBook) {
		bookCatalog.put(newBook.getIsbn(), newBook);
	}


	public Book getBook(String isbn) {	
		return bookCatalog.get(isbn);
	}


	public List<Book> getBooks() {
		return new ArrayList<Book>(bookCatalog.values());
	}


}
