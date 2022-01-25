package br.org.generation.lojadegames.model;


import java.util.List;

import javax.persistence.CascadeType;

/*import java.util.List;*/

/*import javax.persistence.CascadeType;*/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/*import javax.persistence.OneToMany;*/
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*import com.fasterxml.jackson.annotation.JsonIgnoreProperties;*/

@Entity /*informa que a classe e uma tabela*/
@Table(name = "tb_categoria")/*define qal sera o nome da tablea*/
public class Categoria {
	
	
	@Id                                                /*Informa que o atributo e uma chave primaria*/
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min = 2, max = 25)
	private String nomecategoria;
	
	/*@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomecategoria() {
		return nomecategoria;
	}

	public void setNomecategoria(String nomecategoria) {
		this.nomecategoria = nomecategoria;
	}

	

	
	
	

}
