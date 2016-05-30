package com.cg.fidel;

import com.cg.helix.bundle.config.BaseApiBundleConfiguration;
import com.cg.helix.bundle.config.BaseBundleConfiguration;
import com.cg.helix.bundle.config.BaseImplementationBundleConfiguration;
import com.cg.helix.bundle.config.BundleConfiguration;

@BundleConfiguration
public class ImplBundleConfig extends BaseImplementationBundleConfiguration{

    @Override
    public String description() {
        return "MultiModule Implementation Bundle";
    }

/*    @Override
    public Class<? extends BaseApiBundleConfiguration>[] implementBundles() {
        return new Class[]{ApiBundleConfig.class};
    }*/

    @Override
    public Class<? extends BaseBundleConfiguration>[] dependsOnBundles() {
        return new Class[]{DatabaseBundleConfig.class};
    }
}