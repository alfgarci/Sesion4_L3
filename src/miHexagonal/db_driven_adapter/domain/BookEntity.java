package miHexagonal.db_driven_adapter.domain;

import miHexagonal.core.domain.Book;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BookEntity {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;

	@Column(name = "name")

	private String name;


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Book toBook() {

		return new Book(this.id, this.name);

	}

}