package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="EMPRESA", length=45)
	private String empresa;
	
	
	
}
