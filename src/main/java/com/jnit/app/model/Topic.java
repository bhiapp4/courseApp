package com.jnit.app.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of={"topicId"})
@ToString(exclude={"course"})
public class Topic implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long topicId;

	private String name;
	private String duration;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;

	private LocalDateTime createdDateTime;

	private LocalDateTime updatedDateTime;

	@Version
	private Integer versionId;

//	public Topic() {
//
//	}
//
//	public Topic(String name, String duration, Course course) {
//		super();
//		this.name = name;
//		this.duration = duration;
//		this.course = course;
//		this.createdDateTime = LocalDateTime.now();
//		this.updatedDateTime = LocalDateTime.now();
//	}
//
//	public Long getTopicId() {
//		return topicId;
//	}
//
//	public void setTopicId(Long topicId) {
//		this.topicId = topicId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDuration() {
//		return duration;
//	}
//
//	public void setDuration(String duration) {
//		this.duration = duration;
//	}
//
//	public Course getCourse() {
//		return course;
//	}
//
//	public void setCourse(Course course) {
//		this.course = course;
//	}
//
//	public LocalDateTime getCreatedDateTime() {
//		return createdDateTime;
//	}
//
//	public void setCreatedDateTime(LocalDateTime createdDateTime) {
//		this.createdDateTime = createdDateTime;
//	}
//
//	public LocalDateTime getUpdatedDateTime() {
//		return updatedDateTime;
//	}
//
//	public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
//		this.updatedDateTime = updatedDateTime;
//	}
//	
//	public Integer getVersionId() {
//		return versionId;
//	}
//	
//	public void setVersionId(Integer versionId) {
//		this.versionId = versionId;
//	}

}
