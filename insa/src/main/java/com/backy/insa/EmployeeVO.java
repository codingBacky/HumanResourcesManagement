package com.backy.insa;

import java.util.Objects;

public class EmployeeVO {
	
	private int empNo;
	private String empName;
	private String email;
	private String birth;
	private String phoneNo;
	private String postCode;
	private String detailAdd;
	private String regidate;//오라클서버
	private String departCode;//확정 아직 안됨->기본값
	private String jopCode;//확정 아직 안됨->기본값
	public EmployeeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeVO(String empName, String email, String birth, String phoneNo, String postCode, String detailAdd) {
		super();
		this.empName = empName;
		this.email = email;
		this.birth = birth;
		this.phoneNo = phoneNo;
		this.postCode = postCode;
		this.detailAdd = detailAdd;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getDetailAdd() {
		return detailAdd;
	}
	public void setDetailAdd(String detailAdd) {
		this.detailAdd = detailAdd;
	}
	public String getRegidate() {
		return regidate;
	}
	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}
	public String getDepartCode() {
		return departCode;
	}
	public void setDepartCode(String departCode) {
		this.departCode = departCode;
	}
	public String getJopCode() {
		return jopCode;
	}
	public void setJopCode(String jopCode) {
		this.jopCode = jopCode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(birth, departCode, detailAdd, email, empName, empNo, jopCode, phoneNo, postCode, regidate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVO other = (EmployeeVO) obj;
		return Objects.equals(birth, other.birth) && Objects.equals(departCode, other.departCode)
				&& Objects.equals(detailAdd, other.detailAdd) && Objects.equals(email, other.email)
				&& Objects.equals(empName, other.empName) && empNo == other.empNo
				&& Objects.equals(jopCode, other.jopCode) && phoneNo == other.phoneNo
				&& Objects.equals(postCode, other.postCode) && Objects.equals(regidate, other.regidate);
	}
	@Override
	public String toString() {//콘솔에서 확인가능
		return "EmployeeVO [empNo=" + empNo + ", empName=" + empName + ", email=" + email + ", birth=" + birth
				+ ", phoneNo=" + phoneNo + ", postCode=" + postCode + ", detailAdd=" + detailAdd + ", regidate="
				+ regidate + ", departCode=" + departCode + ", jopCode=" + jopCode + "]";
	}
	
}
