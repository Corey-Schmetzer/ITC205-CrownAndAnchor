package CrownAndAnchor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

/**
 *
 * @author Corey Schmetzer
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
Bug1Replication.class,
Bug2Replication.class,
Bug3Replication.class,
Bug4Replication.class,
Bug5Replication.class})
public class CrownAndAnchorTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    public static void main(String[] args) {
      Result result = JUnitCore.runClasses(Bug1Replication.class,
              Bug2Replication.class,
              Bug3Replication.class,
              Bug4Replication.class,
              Bug5Replication.class);
      
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
    }
}
