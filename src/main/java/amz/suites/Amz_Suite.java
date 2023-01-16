package amz.suites;

import static amz.core.Amz_DriverFactory.killDriver;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import amz.operation.Amz_Login;
import amz.operation.Amz_Product;

@RunWith(Suite.class)
@SuiteClasses({ Amz_Login.class, Amz_Product.class

})
public class Amz_Suite {

	@AfterClass
	public static void fechabrowser() {
		killDriver();
	}
}
