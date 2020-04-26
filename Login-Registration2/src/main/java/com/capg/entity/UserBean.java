package com.capg.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user_reg")
public class UserBean {
	@Id
	private int UserId;

	private String UserName;
    private String password;
    private String UserPhone;
    private String UserEmail;
    
    public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserPhone() {
		return UserPhone;
	}
	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((UserEmail == null) ? 0 : UserEmail.hashCode());
		result = prime * result + UserId;
		result = prime * result + ((UserName == null) ? 0 : UserName.hashCode());
		result = prime * result + ((UserPhone == null) ? 0 : UserPhone.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		UserBean other = (UserBean) obj;
		if (UserEmail == null) {
			if (other.UserEmail != null)
				return false;
		} else if (!UserEmail.equals(other.UserEmail))
			return false;
		if (UserId != other.UserId)
			return false;
		if (UserName == null) {
			if (other.UserName != null)
				return false;
		} else if (!UserName.equals(other.UserName))
			return false;
		if (UserPhone == null) {
			if (other.UserPhone != null)
				return false;
		} else if (!UserPhone.equals(other.UserPhone))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
}
