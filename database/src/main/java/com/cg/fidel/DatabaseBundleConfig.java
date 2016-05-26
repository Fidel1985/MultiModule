package com.cg.fidel;

import com.cg.helix.bundle.config.BaseDatabaseBundleConfiguration;
import com.cg.helix.bundle.config.BundleConfiguration;

@BundleConfiguration
public class DatabaseBundleConfig extends BaseDatabaseBundleConfiguration {

    @Override
    public String description() {
        return "Bundle META-INF for the MultiModule application";
    }

}
