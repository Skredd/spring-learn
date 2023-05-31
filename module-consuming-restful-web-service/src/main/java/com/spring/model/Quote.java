package com.spring.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "quote")
public class Quote {
    public Quote() {
    }

    public Quote(String quote) {
        this.quote = quote;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quote")
    private String quote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Quote))
            return false;
        Quote quote1 = (Quote) o;
        return Objects.equals(id, quote1.id) && Objects.equals(quote, quote1.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quote);
    }

    @Override
    public String toString() {
        return "Quote{" + "id=" + id + ", quote='" + quote + '\'' + '}';
    }
}