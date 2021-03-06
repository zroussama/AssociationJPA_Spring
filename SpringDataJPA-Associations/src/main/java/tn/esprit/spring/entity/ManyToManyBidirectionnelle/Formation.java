package tn.esprit.spring.entity.ManyToManyBidirectionnelle;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import tn.esprit.spring.entity.OneToOneBidirectionnelle.FormationDetail;

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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_FD_ID")
	private FormationDetail formationDetail;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<TravauxPratiques> formationTps;

	public Formation(Long id, String theme, FormationDetail formationDetail, Set<TravauxPratiques> formationTps) {
		super();
		this.id = id;
		this.theme = theme;
		this.formationDetail = formationDetail;
		this.formationTps = formationTps;
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

	public Set<TravauxPratiques> getFormationTps() {
		return formationTps;
	}

	public void setFormationTps(Set<TravauxPratiques> formationTps) {
		this.formationTps = formationTps;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
