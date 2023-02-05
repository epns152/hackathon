package program.entity.platforms;

public class Platform {
    private String eventPlatform;
    private String deviceManufacture;
    private String deviceModel;

    public Platform(String eventPlatform, String deviceManufacture, String deviceModel) {
        this.eventPlatform = eventPlatform;
        this.deviceManufacture = deviceManufacture;
        this.deviceModel = deviceModel;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "eventPlatform='" + eventPlatform + '\'' +
                ", deviceManufacture='" + deviceManufacture + '\'' +
                ", deviceModel='" + deviceModel + '\'' +
                '}';
    }
}
