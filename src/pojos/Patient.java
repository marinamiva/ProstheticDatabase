package pojos;
import java.io.Serializable;
import java.sql.Date;

public class Patient implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8467155529721810193L;
	
	private Integer id;
	private String name;
	private String lastname;
<<<<<<< HEAD
	private Float telephone;
=======
	private float telephone;
	private Date dob;
>>>>>>> branch 'master' of https://github.com/bermejo4/Prosthetic-DB.git
	private Date dof;
<<<<<<< HEAD
	private Boolean gender;
=======
	private String gender;
>>>>>>> branch 'master' of https://github.com/bermejo4/Prosthetic-DB.git
	private String problem;
<<<<<<< HEAD
	private String address;
=======
	private String addres;
	private Integer doctor_id;
>>>>>>> branch 'master' of https://github.com/bermejo4/Prosthetic-DB.git
	
	
	public Patient() {
		super();
	}

<<<<<<< HEAD
	public Patient(Integer id, String name, String lastname, Float telephone, Date dof, Boolean gender, String problem,
			String addres) {
=======
	public Patient(Integer id, String name, String lastname, float telephone, Date dof, Date dob, String gender, String problem,
			String addres, Integer doctor_id) {
>>>>>>> branch 'master' of https://github.com/bermejo4/Prosthetic-DB.git
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.telephone = telephone;
		this.dob=dob;
		this.dof = dof;
		this.gender = gender;
		this.problem = problem;
<<<<<<< HEAD
		this.address = addres;
=======
		this.addres = addres;
		this.doctor_id=doctor_id;
>>>>>>> branch 'master' of https://github.com/bermejo4/Prosthetic-DB.git
	}

	

	@Override
<<<<<<< HEAD
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", lastname=" + lastname + ", telephone=" + telephone + ", dof="
				+ dof + ", gender=" + gender + ", problem=" + problem + ", addres=" + address + "]";
	}

	@Override
=======
>>>>>>> branch 'master' of https://github.com/bermejo4/Prosthetic-DB.git
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", lastname=" + lastname + ", telephone=" + telephone + ", dob="
				+ dob + ", dof=" + dof + ", gender=" + gender + ", problem=" + problem + ", addres=" + addres
				+ ", doctor_id=" + doctor_id + "]";
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public float getTelephone() {
		return telephone;
	}


	public void setTelephone(float telephone) {
		this.telephone = telephone;
	}
	
	

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDof() {
		return dof;
	}


	public void setDof(Date dof) {
		this.dof = dof;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getProblem() {
		return problem;
	}


	public void setProblem(String problem) {
		this.problem = problem;
	}


	public String getAddres() {
		return address;
	}


	public void setAddres(String addres) {
		this.address = addres;
	}

	public Integer getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Integer doctor_id) {
		this.doctor_id = doctor_id;
	}
	
	
	
	
	
}
