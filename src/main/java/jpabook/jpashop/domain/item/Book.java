package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("B")
public class Book extends Item {

    private String author;
    private String isbn;

    /**
     * 변경 메서드
     */
    public void updateBook(String name, int price, int stockQuantity, String author, String isbn) {
        setName(name);
        setPrice(price);
        setStockQuantity(stockQuantity);
        setAuthor(author);
        setIsbn(isbn);
    }
}
