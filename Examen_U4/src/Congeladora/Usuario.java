package Congeladora;

public class Usuario {
	public String id_usuario;
	public String password;
	
	public Usuario(String id_usuario, String password) {
		super();
		this.id_usuario = "1234";
		this.password = "1234";
	}

	/**
	 * @return the id_usuario
	 */
	public String getId_usuario() {
		return id_usuario;
	}

	/**
	 * @param id_usuario the id_usuario to set
	 */
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
}
