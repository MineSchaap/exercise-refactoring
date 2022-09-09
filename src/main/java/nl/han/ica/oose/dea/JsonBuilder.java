package nl.han.ica.oose.dea;

import java.util.List;

public class JsonBuilder {
    public static final String START_OBJECT = "{";
    public static final String END_OBJECT = "}";
    public static final String START_COLLECTION = "[";
    public static final String END_COLLECTION = "]";

    public static void removeLastCommaAndSpaceIfCollectionIsNotEmpty(StringBuilder jsonString, List collection) {
        if (collection.size() > 0) {
            jsonString.delete(jsonString.length() - 2, jsonString.length());
        }
    }

    public static void appendPropertyAsJsonData(StringBuilder jsonString, Object firstPart, Object secondPart, Object thirdPart) {
        jsonString.append(firstPart);
        jsonString.append(secondPart);
        jsonString.append(thirdPart);
    }
}
