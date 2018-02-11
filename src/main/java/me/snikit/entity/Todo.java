package me.snikit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

	public Todo() {

	}

	public Todo(String topic, String details) {
		this.topic = topic;
		this.details = details;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	private String topic;

	private String details;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", topic=" + topic + ", details=" + details + "]";
	}

}
