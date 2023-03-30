package com.example;

import com.gradle.maven.extension.api.GradleEnterpriseApi;
import com.gradle.maven.extension.api.GradleEnterpriseListener;
import org.apache.maven.execution.MavenSession;
import org.codehaus.plexus.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
@Component(
        role = GradleEnterpriseListener.class,
        hint = "gradle-enterprise-conventions-maven-extension",
        description = "Configures Gradle Enterprise Build Scans and caching for Maven builds"
)
public final class ConventionMavenExtensionGradleEnterpriseListener implements GradleEnterpriseListener {

    private final Logger logger = LoggerFactory.getLogger(ConventionMavenExtensionGradleEnterpriseListener.class);

    @Override
    public void configure(GradleEnterpriseApi api, MavenSession session) {
        logger.debug("Executing extension: " + getClass().getSimpleName());
        CustomGradleEnterpriseConfig customGradleEnterpriseConfig = new CustomGradleEnterpriseConfig();

        logger.debug("Configuring build scan publishing and applying build scan enhancements");
        customGradleEnterpriseConfig.extendBuildScan(api, session);
        logger.debug("Finished configuring build scan publishing and applying build scan enhancements");
    }

}
