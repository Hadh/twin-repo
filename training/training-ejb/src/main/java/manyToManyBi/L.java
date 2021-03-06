package manyToManyBi;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: L
 *
 */
@Entity

public class L implements Serializable {

	@Id
	private int idL;

	@ManyToMany(mappedBy = "ls")
	private List<K> ks;
	private static final long serialVersionUID = 1L;

	public L() {
		super();
	}

	public int getIdL() {
		return this.idL;
	}

	public void setIdL(int idL) {
		this.idL = idL;
	}

	public List<K> getKs() {
		return ks;
	}

	public void setKs(List<K> ks) {
		this.ks = ks;
	}

}
