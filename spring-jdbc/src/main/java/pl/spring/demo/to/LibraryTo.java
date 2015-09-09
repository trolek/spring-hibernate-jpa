package pl.spring.demo.to;

import java.util.Set;

public class LibraryTo {
    private Long id;
    private String name;
    private AddressTo address;
    private String type;
    private Set<BookTo> books;

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

    public AddressTo getAddress() {
        return address;
    }

    public void setAddress(AddressTo address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<BookTo> getBooks() {
        return books;
    }

    public void setBooks(Set<BookTo> books) {
        this.books = books;
    }
}
