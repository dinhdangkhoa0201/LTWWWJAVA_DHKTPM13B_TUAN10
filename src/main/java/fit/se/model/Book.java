package fit.se.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookID;
	
	private String bookName;
	private String author;
	private String publishYear;
	private int rating;
	private String imageUrl;
	public Book(int bookID, String bookName, String author, String publishYear, int rating, String imageUrl) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.author = author;
		this.publishYear = publishYear;
		this.rating = rating;
		this.imageUrl = imageUrl;
	}
	public Book(int bookID) {
		super();
		this.bookID = bookID;
	}
	public Book() {
		super();
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(String publishYear) {
		this.publishYear = publishYear;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", publishYear=" + publishYear + ", rating="
				+ rating + ", imageUrl=" + imageUrl + "]";
	}
	
	
}
