package FrameWork;

public class AmazonFeature {

    public static AmazonFeature init()
    {
        return new AmazonFeature();
    }

    public AmazonFeature amazonOrder()
    {
        HomepageService.init()
                .getUrl()
                .buyproduct();
        return this;
    }

    public AmazonFeature verifyAmazonHomePage() {
        HomepageService.init()
                .getUrl()
                .VerifyPage();
        return this;

    }
}
