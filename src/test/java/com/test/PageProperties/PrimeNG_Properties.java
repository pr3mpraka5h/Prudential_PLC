package com.test.PageProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrimeNG_Properties {
	
	public static WebDriver driver = null;
	public static By Country_Filter= By.xpath("//*[@class='pi pi-filter-icon pi-filter ng-tns-c73-5']");
	public static By Coutnry_Dropdown=By.xpath("//*[@id='pr_id_5_label']");
	public static By Coutnry_Droplist=By.xpath("//*[@class='p-dropdown-items ng-star-inserted']//li");
	public static By Coutnry_text=By.xpath("//*[@class='p-inputtext p-component p-element ng-star-inserted']");
	public static By apply=By.xpath("//*[@class='p-element p-button-sm ng-tns-c73-5 p-button p-component ng-star-inserted']");
	public static By Date_sort=By.xpath("//*[@psortablecolumn='date']//*[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']");
	public static By table_content=By.xpath("//*[@class='p-element p-datatable-tbody']/tr");

}
