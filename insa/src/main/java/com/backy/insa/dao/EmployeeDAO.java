package com.backy.insa.dao;

import com.backy.insa.EmployeeVO;

public interface EmployeeDAO {

	//int insert(EmployeeVO emp1);

	//int getMaxEmpNo();

	void delAll();

	int getCount();

	int insert(EmployeeVO emp1);

	int maxEmpNo();

	EmployeeVO getOne(int empNo);



}
