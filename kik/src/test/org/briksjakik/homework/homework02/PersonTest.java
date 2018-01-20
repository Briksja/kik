package test.org.briksjakik.homework.homework02; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.briksjakik.homework.homework02.Person;

/** 
* Person Tester. 
* 
* @author <Authors name> 
* @since <pre>sty 20, 2018</pre> 
* @version 1.0 
*/ 
public class PersonTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() {
    Person person = new Person ("jan", "kowalski", 8888 );
    System.out.println(person.toString());

}

    /**
* 
* Method: getPesel() 
* 
*/ 
@Test
public void testGetPesel() throws IllegalArgumentException()
} 

/** 
* 
* Method: setPesel(long pesel) 
* 
*/ 
@Test
public void testSetPesel() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getFirstName() 
* 
*/ 
@Test
public void testGetFirstName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setFirstName(String firstName) 
* 
*/ 
@Test
public void testSetFirstName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getSurName() 
* 
*/ 
@Test
public void testGetSurName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setSurName(String surName) 
* 
*/ 
@Test
public void testSetSurName() throws Exception { 
//TODO: Test goes here... 
} 


} 
