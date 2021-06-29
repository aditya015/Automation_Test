package FrameWork;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import FrameWork.utils.PageInit;


public class PageObjectAmazon extends PageInit {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement AmazonHomePageSearchBar;

    @FindBy(id = "nav-search-submit-button")
    private WebElement SubmitSearch;

    @FindBy(xpath = "//*[@class=\"a-size-medium a-color-base a-text-normal\"]")
    private WebElement selectProduct;

    @FindBy(xpath = "//img[contains(@alt,'Space') and contains(@alt,'Grey')]")
    private WebElement selectColor;

    @FindBy(id = "buy-now-button")
    private WebElement buyNowButton;

    public static PageObjectAmazon init (){
        return new PageObjectAmazon();
    }

    public PageObjectAmazon (){
    PageFactory.initElements(driver,this);
    }

    public PageObjectAmazon enterProductName()
    {
        AmazonHomePageSearchBar.sendKeys("Apple Iphone 11 Pro Max");
        return this;
    }

    public PageObjectAmazon selectColor()
    {
        selectColor.click();
        return this;
    }

    public PageObjectAmazon submitProductSearch()
    {
        SubmitSearch.click();
        return this;
    }

    public PageObjectAmazon clickProduct()
    {
        selectProduct.click();
        return this;
    }

    public PageObjectAmazon productBuyNow()
    {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
         buyNowButton.click();
        return this;
    }
}
