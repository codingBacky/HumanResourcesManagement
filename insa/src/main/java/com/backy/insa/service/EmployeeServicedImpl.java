package com.backy.insa.service;

import com.backy.insa.EmployeeVO;
import com.backy.insa.dao.EmployeeDAO;
import com.backy.insa.dao.EmployeeDAOImpl;

public class EmployeeServicedImpl implements EmployeeService {
/*
	@Override
	public int insert(EmployeeVO emp1) {
		//System.out.println("넘겨받은 자료" + emp1);
		EmployeeDAO dao = new EmployeeDAOImpl();
		int empNo = dao.getMaxEmpNo() + 1;//비즈니스 로직 <-중간에 처리해주는 이런 레이어가 필요
		emp1.setEmpNo(empNo);//사원번호
		//System.out.println("가공 후 자료" + emp1);
		return dao.insert(emp1);
		
	}
	*/
	EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	public void delAll() {
		//EmployeeDAO dao = new EmployeeDAOImpl();
		dao.delAll();
	}

	@Override
	public int getCount() {
		int result = -255;
		//EmployeeDAO dao = new EmployeeDAOImpl();
		result = dao.getCount();
		return result;
	}

	@Override
	public int insert(EmployeeVO emp1) {
		//EmployeeDAO dao = new EmployeeDAOImpl();
		int empNo = dao.maxEmpNo() + 1 ;//선행작업 부족한 자료 채워줌, 사원번호 0번 안됌
		emp1.setEmpNo(empNo);
		int result = dao.insert(emp1);
		return result;
	}

	@Override
	public EmployeeVO getOne(int empNo) {
		/*EmployeeVO rtnVO = null;//지역변수는 만들어지기만 하고 초기값 X 초기값이 있어야 사용 가능함으로 꼭 넣어 줘야함
		rtnVO =  dao.getOne();
		return rtnVO;*/
		return dao.getOne(empNo);
	}

}
