package testScripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pomRepository.LeadsPage;
import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import genericLibrary.ITestListnerImplementationUtil;

@Listeners(ITestListnerImplementationUtil.class)
public class TC_05 extends BaseTest {
	
	@Test
	public void CreateNewLead() throws Exception {
		
		LeadsPage lead=new LeadsPage(driver);
		lead.getLeadsIcon().click();
		ExcelUtil data=new ExcelUtil();
		lead.getFirstNameTextField().sendKeys(data.excelStringFile("Sheet1", 0, 0));
		lead.getDesignationTextField().sendKeys(data.excelStringFile("Sheet1", 3,0));
		lead.getAnnualIncomeTextField().clear();
		lead.getAnnualIncomeTextField().sendKeys(""+data.excelNumericFile("Sheet1", 4,0));
		lead.getNoOfEmployeesTextField().sendKeys(""+data.excelNumericFile("Sheet1", 5,0));
		lead.getSecondaryEmailTextField().sendKeys(data.excelStringFile("Sheet1", 6,0));
		lead.getPhoneTextField().sendKeys(""+data.excelNumericFile("Sheet1", 7,0));
		lead.getMobileTextFeld().sendKeys(""+data.excelNumericFile("Sheet1", 8,0));
		lead.getFaxTextField().sendKeys(""+data.excelNumericFile("Sheet1", 9,0));
		lead.getEmailTextField().sendKeys(data.excelStringFile("Sheet1", 10,0));
		lead.getWebsiteTextField().sendKeys(data.excelStringFile("Sheet1", 11,0));
		lead.getLaneTextField().sendKeys(data.excelStringFile("Sheet1", 12,0));
		lead.getCodeTextField().sendKeys(data.excelStringFile("Sheet1", 13,0));
		lead.getCountryTextField().sendKeys(data.excelStringFile("Sheet1", 14,0));
		lead.getPoboxTextField().sendKeys(""+data.excelNumericFile("Sheet1", 15,0));
		lead.getCityTextField().sendKeys(data.excelStringFile("Sheet1", 16,0));
		lead.getStateTextField().sendKeys(data.excelStringFile("Sheet1", 17,0));
		lead.getDescriptionTextField().sendKeys(data.excelStringFile("Sheet1", 18,0));
		lead.getButton().click();
		driver.switchTo().alert().accept();
		String expectedUrl="http://localhost:8888/index.php?module=Leads&action=EditView&return_action=DetailView&parenttab=Marketing";
		if(expectedUrl.equalsIgnoreCase(driver.getCurrentUrl())) {
			System.out.println("Last Name cannot be empty message is displaying");
		} else {
			System.err.println("last name connot be empty message is not displayed");
		}
		
		
				
	}

	

}
