package com.jojoldu.book.springboot.domain.posts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
