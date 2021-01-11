package com.cg.tdddemo;

import static org.junit.Assert.*;

import org.junit.Test;
/**
        *---------Program to Check whether a string is positive in nature or not------------------* 
**/
public class StringPositiveOrNot_Main {
private StringPositiveOrNot_TestCaseContainer testermethod;
/*------------------------------------------Neutral Test-Case-----------------------------------------------*/
@Test
public void test_for_null(){
       String input_string="";
       String output=null;
       String actual_result= testermethod.isEmpty(input_string);
       assertEquals(output,actual_result);
}
@Test
public void test_for_single_element(){
       String input_string="A";
       String actual_result= testermethod.checkForSingleCharacter(input_string);
       assertEquals(input_string,actual_result);
}
/*------------------------------------------Negative Test-Cases-----------------------------------------------*/
@Test
public void test_for_whitespace_presence() {
       String input_string="AN T";
       String expected_result="WhiteSpace Exception Caught";
       String actual_result= testermethod.checkForWhitespace(input_string);
       assertEquals(expected_result,actual_result);
}
@Test
public void test_for_number_presence() {
       String input_string="AN3T";
       String expected_result="Number Exception Caught";
       String actual_result= testermethod.checkForNumber(input_string);
       assertEquals(expected_result,actual_result);
}
@Test
public void test_for_similar_character_presence() {
       String input_string="TTTT";
       String expected_result="Same Characters in String";
       String actual_result= testermethod.checkForSimilarCharacter(input_string);
       assertEquals(expected_result,actual_result);
}       
@Test
public void test_for_negative_string_nature() {
       String input_string="ANTT";
       String expected_result="Positive String";
       String actual_result= testermethod.stringPositiveOrNot(input_string);
       assertEquals(expected_result,actual_result);
}      
/*-----------------------------------------Positive Test-Cases----------------------------------------------*/
@Test
public void test_for_whitespace_absence() {
       String input_string="ANT";
       String expected_result="No Exception Caught";
       String actual_result= testermethod.checkForWhitespace(input_string);
       assertEquals(expected_result,actual_result);
}
@Test
public void test_for_number_absence() {
       String input_string="ANT";
       String expected_result="No Exception Caught";
       String actual_result= testermethod.checkForNumber(input_string);
       assertEquals(expected_result,actual_result);
}
@Test
public void test_for_similar_character_absence() {
       String input_string="ANTT";
       String expected_result="Characters are different";
       String actual_result= testermethod.checkForSimilarCharacter(input_string);
       assertEquals(expected_result,actual_result);
}      
@Test
public void test_for_positive_string_nature() {
       String input_string="ANTT";
       String expected_result="Positive String";
       String actual_result= testermethod.stringPositiveOrNot(input_string);
       assertEquals(expected_result,actual_result);
}      
}


