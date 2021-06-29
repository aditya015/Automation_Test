package FrameWork;

import FrameWork.PageObjectAmazon;
import FrameWork.HomepageService;

public class Feature {

    public static Feature init()
    {
        return new Feature();
    }

    public Feature amazonOrder()
    {
        HomepageService.init()
                .getUrl();
        return this;
    }
}
