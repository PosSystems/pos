
package com.pos.system.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DBAccessTest.class, PosBeanTest.class })
public class AllTests {

}
