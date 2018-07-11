package br.com.agmg.soapexample.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.agmg.soapexample.exception.InvalidBookReference;
import br.com.agmg.soapexample.model.Book;

@WebService(name="BookCatalog", targetNamespace="http://www.agmg.soapexample.com.br")
public interface BookCatalog {

	@WebMethod(action="add_book", operationName="addBook")
	public void addBook(@WebParam(name="Book") Book newBook);
	
	@WebMethod(action="get_book", operationName="getBook")
	@WebResult(name="Book")
	public Book getBook(@WebParam(name="Isbn") String isbn) throws InvalidBookReference;
	
	@WebMethod(action="get_books", operationName="getBooks")
	@WebResult(name="Book")
	public List<Book> getBooks();
}
