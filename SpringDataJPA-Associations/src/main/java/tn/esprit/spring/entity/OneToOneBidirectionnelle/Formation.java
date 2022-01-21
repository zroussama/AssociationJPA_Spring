package tn.esprit.spring.entity.OneToOneBidirectionnelle;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_FORMATION")
public class Formation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FORMATION_ID")
	private Long id; // Identifiant formation (Clé primaire)
	
	@Column(name = "FORMATION_THEME")
	private String theme; // Thème formation
	
	@OneToOne
	private FormationDetail formationDetail; //fkey we7d hné

	public Formation(Long id, String theme, FormationDetail formationDetail) {
		super();
		this.id = id;
		this.theme = theme;
		this.formationDetail = formationDetail;
	}

	public Formation() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public FormationDetail getFormationDetail() {
		return formationDetail;
	}

	public void setFormationDetail(FormationDetail formationDetail) {
		this.formationDetail = formationDetail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
