package jean.ProjetoLocadora.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "filmes")
public class Filmes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String titulo;
	
	private String valorLocacao;
	
	private String direcao;
	
	private String atoresPrincipais;
	
	private String categoria;
	
	private String censura;
	
	private String dublado;
	
	private String legendado;

	private String sinopse;
	
	private String cartaz;

	
	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(String valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getAtoresPrincipais() {
		return atoresPrincipais;
	}

	public void setAtoresPrincipais(String atoresPrincipais) {
		this.atoresPrincipais = atoresPrincipais;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCensura() {
		return censura;
	}

	public void setCensura(String censura) {
		this.censura = censura;
	}

	public String getDublado() {
		return dublado;
	}

	public void setDublado(String dublado) {
		this.dublado = dublado;
	}

	public String getLegendado() {
		return legendado;
	}

	public void setLegendado(String legendado) {
		this.legendado = legendado;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getCartaz() {
		return cartaz;
	}

	public void setCartaz(String cartaz) {
		this.cartaz = cartaz;
	}


	@Override
	public String toString() {
		return "Filmes [id=" + id + ", titulo=" + titulo + ", valorLocacao=" + valorLocacao + ", direcao=" + direcao
				+ ", atoresPrincipais=" + atoresPrincipais + ", categoria=" + categoria + ", censura=" + censura
				+ ", dublado=" + dublado + ", legendado=" + legendado + ", sinopse=" + sinopse + ", cartaz=" + cartaz
				+ "]";
	}
	
	
	
}
