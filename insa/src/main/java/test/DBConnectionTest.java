package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

import com.backy.insa.DBUtil;

public class DBConnectionTest {
	@Test
	@Ignore//테스트 성공했으니 다시 안해도됌
	public void getConnectionTest() {//DB연결 테스트 DBconnection class 별도 생성하기도 함
		assertNotNull(DBUtil.getConnection());
	}
}
