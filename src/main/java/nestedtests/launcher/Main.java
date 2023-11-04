package nestedtests.launcher;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;

import org.junit.platform.launcher.LauncherSession;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

public class Main {
    public static void main(String[] args) {
        var request = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectPackage("nestedtests.tests"))
                .build();
        try (LauncherSession session = LauncherFactory.openSession()) {
            session.getLauncher().execute(request);
        }
    }
}
