package framework.test;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(locations={"classpath*:/resource/app/*.xml"})
@SuppressWarnings("unchecked")
//@RunWith(SpringJUnit4ClassRunner.class)
//AbstractTransactionalJUnit4SpringContextTests
public class BaseSqliteTest  extends AbstractTransactionalJUnit4SpringContextTests{
	
	@Autowired
	public void setDataSource(@Qualifier("sqliteDataSource")DataSource dataSource) {
		super.setDataSource(dataSource);
	}
}
