import FrameWork.AmazonFeature;
import org.testng.annotations.Test;

public class TestCase {


    @Test
    public void Test_01_VERIFY_USER_CAN_SEARCH_AND_ADD_PRODUCT_TO_CART ()
    {
        AmazonFeature.init()
                .amazonOrder();
    }

    @Test
    public void Test_02_VERIFY_HOMEPAGE_IS_LAODED ()
    {
        AmazonFeature.init()
                .verifyAmazonHomePage();
    }


}