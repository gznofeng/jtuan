package framework.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations={"classpath*:/resource/app/*.xml"})
@SuppressWarnings("unchecked")
@RunWith(SpringJUnit4ClassRunner.class)
//AbstractTransactionalJUnit4SpringContextTests
public class TransactionBaseTest {

}
