# Automation3
Pomclass1
public class Pomm1 {
	
	@FindBy(xpath="//input[@name='firstname']")private WebElement fristname;
	@FindBy(xpath="//input[@name='lastname']")private WebElement lastname;
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement mob;
	public Pomm1(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
		
		public void m1(String n) 
		{
			fristname.sendKeys(n);
		}
		public void m2(String n2) {
			lastname.sendKeys(n2);
		}
		public void m3(String mo) {
			mob.sendKeys(mo);
		
		}
		
}
