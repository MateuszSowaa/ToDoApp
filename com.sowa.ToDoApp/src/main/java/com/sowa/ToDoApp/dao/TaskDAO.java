package com.sowa.ToDoApp.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import com.sowa.ToDoApp.entities.Task;

public class TaskDAO {
	private EntityManager em;
	
	public TaskDAO(EntityManager em){
		this.em = em;
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
	public void deleteTask(int id){
		Task task = this.em.find(Task.class, id);
		if(task != null){
			em.getTransaction().begin();
			em.remove(task);
			em.getTransaction().commit();
		}
		
	}
}
