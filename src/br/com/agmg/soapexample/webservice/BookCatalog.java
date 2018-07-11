package br.com.agmg.soapexample.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.agmg.soapexample.model.Book;

@WebService(name="br.com.agmg.soapexample.webservice.BookCatalog", targetNamespace="http://www.agmg.soapexample.com.br")
public interface BookCatalog {

	@WebMethod(action="addbook", operationName="addBook")
	public void addBook(@WebParam(name="book") Book newBook);
	
	@WebMethod(action="getbook", operationName="getBook")
	@WebResult(name="Book")
	public Book getBook(@WebParam(name="isbn") String isbn);
	
	@WebMethod(action="getbooks", operationName="getBooks")
	@WebResult(name="Books")
	public List<Book> getBooks();
}
