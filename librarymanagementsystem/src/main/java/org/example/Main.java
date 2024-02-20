package org.example;


import jakarta.persistence.*;
import org.example.entity.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Librarymanagement");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
 /*       Author author= new Author();
        author.setName("Victorr Hugo");
        author.setBirthDate(LocalDate.of(1905,03,01));
        author.setCountry("France");
        entityManager.persist(author);

        Publisher publisher= new Publisher();
        publisher.setName("Can Kitabevi");
        publisher.setAddress("İstanbul");
        publisher.setEstablishmentYear(2000);
        entityManager.persist(publisher);

        Category c1 = new Category();
        c1.setDescription("Polisiye");
        c1.setName("Polisiye romanlar,gizemli ve heyecanlı suç hikayelerini içerir");
        entityManager.persist(c1);

        Category c2 = new Category();
        c2.setDescription("Klasik Roman");
        c2.setName("klasik romanlar, edebiyat tarihinde önemli bir yere sahiptir.");
        entityManager.persist(c2);

        Book book = new Book();
        book.setName("sefiller");
        book.setStock(10);
        book.setPublicationYear(1862);
        book.setAuthor(author);
        book.setPublisher(publisher);
        List<Category> categories = new ArrayList<>();
        categories.add(c1);
        categories.add(c2);
        book.setCategoryList(categories);
        entityManager.persist(book);

        BookBorrowing bookBorrowing = new BookBorrowing();
        bookBorrowing.setBorrowerName("Dogus Karakus");
        bookBorrowing.setBook(book);
        bookBorrowing.setBorrowingDate(LocalDate.now());
        bookBorrowing.setReturnDate(null);
        entityManager.persist(bookBorrowing);*/



        /*Book b1 = entityManager.find(Book.class,1);
        System.out.println(b1);*/

        Author a1 =  entityManager.find(Author.class,1);
        System.out.println(a1.getName());

        entityManager.remove(a1);
        transaction.commit();




    }
}