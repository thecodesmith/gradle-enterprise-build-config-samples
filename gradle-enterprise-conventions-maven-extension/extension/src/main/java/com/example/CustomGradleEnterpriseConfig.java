package com.example;

import com.gradle.maven.extension.api.GradleEnterpriseApi;
import com.gradle.maven.extension.api.scan.BuildScanApi;
import org.apache.maven.execution.MavenSession;

final class CustomGradleEnterpriseConfig {

    void extendBuildScan(GradleEnterpriseApi api, MavenSession session) {
        BuildScanApi buildScan = api.getBuildScan();

        // Use `buildScan` to create commonly needed tags, values, and links. For example:
        // buildScan.tag("Sample Tag");
        // buildScan.value("Sample Name", "Sample Value");
        // buildScan.link("Sample Link", "https://example.com");
    }
}
