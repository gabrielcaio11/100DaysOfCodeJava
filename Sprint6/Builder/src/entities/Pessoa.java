package entities;

public class Pessoa {

	private String firstName;
	private String lastName;
	private String userName;
	private String email;

	private Pessoa(String firstName, String lastName, String userName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", email="
				+ email + "]";
	}
	
	public static class PessoaBuilder {
		
		private String firstName;
		private String lastName;
		private String userName;
		private String email;
		
		public PessoaBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public PessoaBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public PessoaBuilder userName(String userName) {
			this.userName = userName;
			return this;
		}
		
		public PessoaBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public Pessoa builder() {
			return new Pessoa(firstName,lastName,userName,email);
		}
		
	}

}
