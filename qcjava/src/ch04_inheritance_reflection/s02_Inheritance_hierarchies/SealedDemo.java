package ch04_inheritance_reflection.s02_Inheritance_hierarchies;

import java.util.ArrayList;
import java.util.HashMap;

sealed interface JSONValue permits JSONArray, JSONObject, JSONPrimitive {
    public default String type() {
        return switch (this) {
            case JSONArray j -> "array";
            case JSONNumber j -> "number";
            case JSONString j -> "string";
            case JSONBoolean j -> "boolean";
            case JSONObject j -> "object";
            case JSONNull j -> "null";
            // No default needed here
        };
    }
}

final class JSONArray extends ArrayList<JSONValue> implements JSONValue {

}

final class JSONObject extends HashMap<String,JSONValue> implements JSONValue {
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (Entry<String, JSONValue> entry : entrySet()) {
            if (result.length() > 1) result.append(",");
            result.append(" \"");
            result.append(entry.getKey());
            result.append("\":");
            result.append(entry.getValue());
        }
        result.append(" }");
        return result.toString();
    }
}

sealed interface JSONPrimitive extends JSONValue permits JSONNumber, JSONString, JSONBoolean, JSONNull {
}

final record JSONNumber(double value) implements JSONPrimitive{
    @Override
    public String toString() {
        return "" + value;
    }
}

final record JSONString(String value) implements JSONPrimitive {
    @Override
    public String toString() {
        return "\"" + value.translateEscapes() + "\"";
    }
}

enum JSONBoolean implements JSONPrimitive {
    FALSE, TRUE;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}

enum JSONNull implements JSONPrimitive {
    INSTANCE;

    @Override
    public String toString() {
        return "null";
    }
}
public class SealedDemo {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("name", new JSONString("Harry"));
        obj.put("salary", new JSONNumber(90000));
        obj.put("married", JSONBoolean.FALSE);
        JSONArray arr = new JSONArray();
        arr.add(new JSONNumber(13));
        arr.add(JSONNull.INSTANCE);
        arr.add(obj);
        System.out.println(arr);

        JSONObject obj1 = new JSONObject();
        obj1.put("name", new JSONString("Harry"));
        obj1.put("salary", new JSONNumber(90000));
        obj1.put("married", JSONBoolean.FALSE);
        JSONArray arr1 = new JSONArray();
        arr1.add(new JSONNumber(13));
        arr1.add(JSONNull.INSTANCE);

        obj1.put("luckyNumbers",arr1);
        System.out.println(obj1);
        System.out.println(obj1.type());
    }
}
