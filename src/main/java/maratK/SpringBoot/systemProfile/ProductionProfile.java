package maratK.SpringBoot.systemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is Production";
    }
}
