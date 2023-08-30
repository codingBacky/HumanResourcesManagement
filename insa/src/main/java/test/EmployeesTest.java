package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.backy.insa.EmployeeVO;
import com.backy.insa.service.EmployeeService;
import com.backy.insa.service.EmployeeServicedImpl;


	public class EmployeesTest {
	EmployeeVO emp1, emp2, emp3;//샘플 데이터 만들기 3~5개 정도
	EmployeeService service = null;//필드 초기값 설정안해도 초기값이 들어감
	 @Before//test 수행전 before수행 
	   public void init() {//테스트용 샘플 자료 위에 바로 집어 넣어도 됨, 아래 데이터로 초기화 시켜줌
		 service = new EmployeeServicedImpl();
		 service.delAll();//delete from employees 쿼리문 시켜야지^.^
		 assertEquals(service.getCount(), 0);//위에꺼 포함해서 확인해야해!
		 emp1 = new EmployeeVO("backy", "backy@na.com", "2000-01-01", "01012341111", "12567", "수원시");
	      emp2 = new EmployeeVO("hyeony", "hyeony@na.com", "2001-12-01", "01023452222", "12567", "수원시");
	      emp3 = new EmployeeVO("backk", "backky@na.com", "2005-01-01", "01012393333", "12567", "수원시");
	   }
	 @Test
	 public void delAllTest() {
		 //EmployeeService service = new EmployeeServicedImpl();
		 service.delAll();//delete from employees 쿼리문 시켜야지^.^
		 assertEquals(service.getCount(), 0);//select count(*) cnt from employees;
	 }
	   
/*
	@Test
	@Ignore//테스트 성공했으니 다시 안해도됌
	public void getConnectionTest() {//DB연결 테스트 DBconnection class 별도 생성하기도 함
		assertNotNull(DBUtil.getConnection());
	}
	 
	 
	@Test
	public void insertTest() {//서비스에 일시키기
		EmployeeService service = new EmployeeServicedImpl();
		int result = service.insert(emp1);
		assertEquals(result, 1);
		result = service.insert(emp2);
		assertEquals(result, 1);
		result = service.insert(emp3);
		assertEquals(result, 1);
		
	}
	*/
	 @Test
		public void insertTest() {
		 //EmployeeService service = new EmployeeServicedImpl();
		 //service.delAll();//delete from employees 쿼리문 시켜야지^.^
		 //assertEquals(service.getCount(), 0);//위에꺼 포함해서 확인해야해!
		 int result = service.insert(emp1);//숫자 반환받음
		 assertEquals(result, 1);//하나 입력함, 인원세면 1이 나옴 한번 더 물어봐야함
		 assertEquals(service.getCount(), 1);//
		 result = service.insert(emp2);//숫자 반환받음
		 assertEquals(result, 1);//하나 입력함, 인원세면 2이 나옴 한번 더 물어봐야함
		 assertEquals(service.getCount(), 2);//
		 result = service.insert(emp3);//숫자 반환받음
		 assertEquals(result, 1);//하나 입력함, 인원세면 3이 나옴 한번 더 물어봐야함
		 assertEquals(service.getCount(), 3);//
		 
		 //각각의 자료들을 꺼내와서 원하는 컬럼에 원하는 값이 정확하게 입력되었는지 체크하기
		 objEqual(emp1, service.getOne(1));//비교
		 objEqual(emp2, service.getOne(2));
		 objEqual(emp3, service.getOne(3));
	 }
	 public void objEqual(EmployeeVO inVo, EmployeeVO resVO){
		 assertEquals(inVo.getBirth(), resVO.getBirth().substring(0,10));
		 //assertEquals(inVo.getDepartCode(), resVO.getDepartCode());
		 assertEquals(inVo.getDetailAdd(), resVO.getDetailAdd());
		 assertEquals(inVo.getEmail(), resVO.getEmail());
		 assertEquals(inVo.getEmpName(), resVO.getEmpName());
		 //assertEquals(inVo.getJopCode(), resVO.getJopCode());
		 assertEquals(inVo.getPhoneNo(), resVO.getPhoneNo());
		 //assertEquals(inVo.getRegidate(), resVO.getRegidate());
		 assertEquals(inVo.getPostCode(), resVO.getPostCode());
	 }
	 @Test
	 public void getOne() {
		//EmployeeService service = new EmployeeServicedImpl();
		 int result = service.insert(emp1);//1번 사원 입력
		 assertEquals(result, 1);
		 assertEquals(service.getCount(), 1);
		 EmployeeVO getVO = service.getOne(1);//사원번호 1
		 objEqual(emp1, getVO);
		 /*
		 assertEquals(emp1.getBirth(), getVO.getBirth().substring(0,10));
		 assertEquals(emp1.getDepartCode(), getVO.getDepartCode());
		 assertEquals(emp1.getDetailAdd(), getVO.getDetailAdd());
		 assertEquals(emp1.getEmail(), getVO.getEmail());
		 assertEquals(emp1.getEmpName(), getVO.getEmpName());
		 assertEquals(emp1.getJopCode(), getVO.getJopCode());
		 assertEquals(emp1.getPhoneNo(), getVO.getPhoneNo());
		 assertEquals(emp1.getRegidate(), getVO.getRegidate());
		 assertEquals(emp1.getPostCode(), getVO.getPostCode());
		 */
	 
	 }
	 
}