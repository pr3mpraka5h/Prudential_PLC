/*Author : Premprakash Lakshmanan
 * Date : 5th Jan 2023
 * Package and Class : RCB package - RCBSquadValidation class
 * Description : This java class file is to handle Logger file configurations and its setup.
 * Last modified : 5th Jan 2023
 * ChangeLog :
 * 			<Version number> : < Author> : < Date> : <Desc> 
 */

package com.test.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
/**
 * 
 *
 */
public class LoggerHelper {

	private static boolean root=false;
	
	public static Logger getLogger(Class cls){
		if(root){
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}
	
	public static void main(String[] args) {
		Logger log = LoggerHelper.getLogger(LoggerHelper.class);
	}
}