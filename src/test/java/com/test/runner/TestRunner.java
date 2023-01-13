/*Author : Premprakash Lakshmanan
 * Date : 5th Jan 2023
 * Package and Class : RCB package - RCBSquadValidation class
 * Description : This java class file is to handle all RCB squad related functionalities to cover.
 * Last modified : 5th Jan 2023
 * ChangeLog :
 * 			<Version number> : < Author> : < Date> : <Desc> 
 */

package com.test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = ".//src//test//resources//feature",
//tags= {""},
glue = { "com.test.StepDef"},
monochrome = true, 
dryRun = false,
format = { "pretty","html:test-output", "json:target/cucumber.json" }, 
plugin = { "json:target/cucumber.json" })

public class TestRunner extends AbstractTestNGCucumberTests {

}