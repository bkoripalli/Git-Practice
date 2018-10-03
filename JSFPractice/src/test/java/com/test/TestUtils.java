package com.test;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.jsf.practice.bean.Utils;

public class TestUtils {
	
	Utils utils;
	
	@Before
	public void setUp() {

         //1 master
		/** added java doc comment*/
		//Removed sops and added logg statements.

		utils = new Utils();
	}
	
	@Test
	public void test_remove_white_spaces() {		
	   	Assert.assertEquals("cococola", utils.removeWhiteSpaces("coco co:la   "));
	}
    
	@Test
	public void test() {
          org.junit.Assert.fail();		
	}
}
