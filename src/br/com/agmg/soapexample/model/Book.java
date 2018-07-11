package br.com.agmg.soapexample.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Book")
public class Book {
	
	private String title;
	
	private String subTitle;
	
	private List<String> authors;
	
	private int publicationYear;
	
	private String publisher;
	
	private String isbn;
	
	public Book(String title, String subTitle, List<String> authors, int publicationYear, String publisher, String isbn) {
		this.title = title;
		this.subTitle = subTitle;
		this.authors = authors;
		this.publicationYear = publicationYear;
		this.publisher = publisher;
		this.isbn = isbn;
	}

	@XmlElement(name="Title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@XmlElement(name="SubTitle")
	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	@XmlElement(name="Authors")
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	@XmlElement(name="PublicationYear")
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	@XmlElement(name="Publisher")
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@XmlElement(name="Isbn")
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
