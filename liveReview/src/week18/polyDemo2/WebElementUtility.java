package week18.polyDemo2;

public class WebElementUtility {
    public static void clickElement(WebElement element){
        System.out.println("Clicking on the element");
        element.click();//element object is a polyMorphic object
    }

    public static WebElement getLinkWithText(String txt){
        System.out.println("Searching for a link with txt "+txt);
        return new Links();  // new InputField
    }

}
