package program.entity.events;


public enum EventType {
    SIGN_UP_SUCCESS ("Sign Up Success"),
    ADD_VEHICLE_SUCCESS ("Add Vehicle Success"),
    UNKNOWN ("sasdas");


    private String name;
    EventType(String name) {
        this.name = name;
    }

    public static EventType getTypeFromName(String name) {
        for (EventType type : EventType.values()) {
            if (type.name.equals(name)) {
                return type;
            }
        }
        System.out.println("Unknown event type: " + name);
        return UNKNOWN;
    }
}
