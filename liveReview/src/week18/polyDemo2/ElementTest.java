package week18.polyDemo2;

public class ElementTest {
    public static void main(String[] args) {
        Links link = new Links();//no poly
        link.click();
        link.getText();
        link.getLinkHref();
        link.sendKeys("xyz");

        WebElement loginLink = new Links(); //polymorphism
        loginLink.click();



    }
}
