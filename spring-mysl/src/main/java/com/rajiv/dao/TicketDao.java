package com.rajiv.dao;

import org.springframework.data.repository.CrudRepository;

import com.rajiv.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
