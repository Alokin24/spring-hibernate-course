package com.jdbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {

  // annotate as entity and map to db table
  
  // define the fields
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="id")
  private int id;
  
  @Column(name="youtube_channel")
  private String youtubeChannel;
  
  @Column(name="hobby")
  private String hobby;
   
  // annotate the fields with db column names
  
  // create constructor, getter, setter, toString
}
