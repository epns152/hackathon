package program.entity.properties;


public class EventProperties {
    private String properties;

    public EventProperties(String props) {
        properties = props;
    }

    @Override
    public String toString() {
        return "EventProperties{" +
                "properties='" + properties + '\'' +
                '}';
    }
}
