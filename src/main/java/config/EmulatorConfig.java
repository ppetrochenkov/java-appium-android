package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system.properties",
        "file:src/test/resources/config/emulator.properties"
})
public interface EmulatorConfig extends Config {

    @Key("deviceName")
    String deviceName();

    @Key("platformName")
    String platformName();

    @Key("version")
    String version();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();

    @Key("remoteURL")
    String remoteURL();

    @Key("app")
    String app();
}
