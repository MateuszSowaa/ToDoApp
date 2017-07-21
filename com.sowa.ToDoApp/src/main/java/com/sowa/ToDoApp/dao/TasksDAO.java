package com.sowa.ToDoApp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import java.util.List;

import com.sowa.ToDoApp.entities.Task;
import com.sowa.ToDoApp.utils.DBConfig;

public class TasksDAO {
	private EntityManager em;
	public TasksDAO(){
		this.em = DBConfig.getEntityManagerFactory().createEntityManager();
	}
	
	public List<Task> getTasks(){
		@SuppressWarnings("unchecked")
		List<Task> tasks = this.em.createQuery("SELECT t FROM Task t").getResultList();
		return tasks;
	}
	
	public Task getTask(int id){
		this.em.clear();
		return this.em.find(Task.class, id);
	}
	public boolean addTask(Task t){
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.persist(t);
			et.commit();
			return true;
		} catch (Exception e){
			e.printStackTrace();
			et.rollback();
			return false;
			
		}
	}
}
