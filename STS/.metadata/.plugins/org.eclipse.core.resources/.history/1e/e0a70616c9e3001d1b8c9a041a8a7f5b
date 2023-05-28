package com.johnp.musicfest.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table (name ="Lineup")
public class Lineup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "Timeslot 1 must be provided.")
    private String timeslot1;
    @NotNull(message = "Timeslot 2 must be provided.")
    private String timeslot2;
    @NotNull(message = "Timeslot 3 must be provided.")
    private String timeslot3;
    @NotNull(message = "Timeslot 4 must be provided.")
    private String timeslot4;
    @NotNull(message = "Timeslot 5 must be provided.")
    private String timeslot5;
    @NotNull(message = "Timeslot 6 must be provided.")
    private String timeslot6;
   


	
	

	
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="User_Id")
	private User user;
	public Lineup() {
		
	}
	@PrePersist
	protected void onCreate () {
		this.createdAt= new Date();
	}
	@PreUpdate
	protected void onUpdate () {
		this.updatedAt = new Date();
	}



	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTimeslot1() {
		return timeslot1;
	}

	public void setTimeslot1(String timeslot1) {
		this.timeslot1 = timeslot1;
	}

	public String getTimeslot2() {
		return timeslot2;
	}

	public void setTimeslot2(String timeslot2) {
		this.timeslot2 = timeslot2;
	}

	public String getTimeslot3() {
		return timeslot3;
	}

	public void setTimeslot3(String timeslot3) {
		this.timeslot3 = timeslot3;
	}

	public String getTimeslot4() {
		return timeslot4;
	}

	public void setTimeslot4(String timeslot4) {
		this.timeslot4 = timeslot4;
	}

	public String getTimeslot5() {
		return timeslot5;
	}

	public void setTimeslot5(String timeslot5) {
		this.timeslot5 = timeslot5;
	}

	public String getTimeslot6() {
		return timeslot6;
	}

	public void setTimeslot6(String timeslot6) {
		this.timeslot6 = timeslot6;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	  private String selectedOption;

	  public String getSelectedOption() {
	    return selectedOption;
	  }



}
