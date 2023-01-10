package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system.properties",
        "file:src/test/resources/config/test.properties"
})
public interface TestConfig extends Config {

    @Key("updateScreenshots")
    boolean isScreenUpdateRequired();

    @Key("deviceHost")
    String deviceHost();
}
