package com.iparhan.financial.entity;

public class User {
	private String id;
	private String username;
	private String password;
	private String repassword;
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(String id, String username, String password, String repassword, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.repassword = repassword;
		this.email = email;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String realName; // 真实姓名
	private String IdType; // ID类型
	private String IdNumber; // ID号

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdType() {
		return IdType;
	}

	public void setIdType(String idType) {
		IdType = idType;
	}

	public String getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(String idNumber) {
		IdNumber = idNumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", repassword=" + repassword
				+ ", email=" + email + ", realName=" + realName + ", IdType=" + IdType + ", IdNumber=" + IdNumber
				+ ", getId()=" + getId() + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword()
				+ ", getRepassword()=" + getRepassword() + ", getEmail()=" + getEmail() + ", getRealName()="
				+ getRealName() + ", getIdType()=" + getIdType() + ", getIdNumber()=" + getIdNumber() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public User(String id, String username, String password, String repassword, String email, String realName,
			String idType, String idNumber) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.repassword = repassword;
		this.email = email;
		this.realName = realName;
		IdType = idType;
		IdNumber = idNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IdNumber == null) ? 0 : IdNumber.hashCode());
		result = prime * result + ((IdType == null) ? 0 : IdType.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((realName == null) ? 0 : realName.hashCode());
		result = prime * result + ((repassword == null) ? 0 : repassword.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		User other = (User) obj;
		if (IdNumber == null) {
			if (other.IdNumber != null)
				return false;
		} else if (!IdNumber.equals(other.IdNumber))
			return false;
		if (IdType == null) {
			if (other.IdType != null)
				return false;
		} else if (!IdType.equals(other.IdType))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (realName == null) {
			if (other.realName != null)
				return false;
		} else if (!realName.equals(other.realName))
			return false;
		if (repassword == null) {
			if (other.repassword != null)
				return false;
		} else if (!repassword.equals(other.repassword))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}
