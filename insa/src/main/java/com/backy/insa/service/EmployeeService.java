package com.backy.insa.service;

import com.backy.insa.EmployeeVO;

public interface EmployeeService {

	//int insert(EmployeeVO emp1);

	void delAll();

	int getCount();

	int insert(EmployeeVO emp1);

	EmployeeVO getOne(int empNo);




}
