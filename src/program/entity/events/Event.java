package program.entity.events;

import program.entity.platforms.Platform;
import program.entity.properties.EventProperties;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Event {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private String userId;
    private EventType type;
    private String userState;
    private LocalDateTime timestamp;
    private Platform platform;
    private EventProperties properties;

    public String getName() {
        return type.name();
    }

    public String getUserId() {
        return userId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getUserState() {
        return userState;
    }

    public Platform getPlatform() {
        return platform;
    }

    public EventProperties getProperties() {
        return properties;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setType(String type) {
        this.type = EventType.getTypeFromName(type);
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = LocalDateTime.parse(timestamp, formatter);
    }

    public void setPlatform(String platform, String manufacture, String deviceModel) {
        this.platform = new Platform(platform, manufacture, deviceModel);
    }

    public void setProperties(String properties) {
        this.properties = new EventProperties(properties);
    }

    @Override
    public String toString() {
        return "Event{" +
                "userId='" + userId + '\'' +
                ", userState='" + userState + '\'' +
                ", type=" + type.name() +
                ", properties=" + properties +
                ", timestamp=" + timestamp +
                ", platform=" + platform +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return userId.equals(event.userId) && type == event.type && userState.equals(event.userState) && timestamp.equals(event.timestamp) && platform.equals(event.platform) && properties.equals(event.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, type, userState, timestamp, platform, properties);
    }
}
