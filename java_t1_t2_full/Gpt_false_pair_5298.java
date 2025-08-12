public Object read (JsonElement in) {
    if (in.isJsonArray ()) {
        List < Object > list = new ArrayList < Object > ();
        JsonArray arr = in.getAsJsonArray ();
        for (JsonElement anArr : arr) {
            list.add (read (anArr));
        }
        return list;
    } else if (in.isJsonObject ()) {
        Map < String, Object > map = new LinkedTreeMap < String, Object > ();
        JsonObject obj = in.getAsJsonObject ();
        Set < Map.Entry < String, JsonElement > > entitySet = obj.entrySet ();
        for (Map.Entry < String, JsonElement > entry : entitySet) {
            map.put (entry.getKey (), read (entry.getValue ()));
        }
        return map;
    } else if (in.isJsonPrimitive ()) {
        JsonPrimitive prim = in.getAsJsonPrimitive ();
        if (prim.isBoolean ()) {
            return prim.getAsBoolean ();
        } else if (prim.isString ()) {
            return prim.getAsString ();
        } else if (prim.isNumber ()) {
            Number num = prim.getAsNumber ();
            if (Math.ceil (num.doubleValue ()) == num.longValue ()) return num.longValue ();
            else {
                return num.doubleValue ();
            }
        }
    }
    return null;
}


public Object read(JsonElement in) {
    if (in.isJsonArray()) {
        List<Object> list = new ArrayList<Object>();
        JsonArray arr = in.getAsJsonArray();
        for (JsonElement anArr : arr) {
            list.add(read(anArr));
        }
        return list;
    } else if (in.isJsonObject()) {
        Map<String, Object> map = new LinkedTreeMap<String, Object>();
        JsonObject obj = in.getAsJsonObject();
        Set<Map.Entry<String, JsonElement>> entitySet = obj.entrySet();
        for (Map.Entry<String, JsonElement> entry : entitySet) {
            map.put(entry.getKey(), read(entry.getValue()));
        }
        return map;
    } else if (in.isJsonPrimitive()) {
        JsonPrimitive prim = in.getAsJsonPrimitive();
        switch (prim.getKind()) {
            case BOOLEAN:
                return prim.getAsBoolean();
            case STRING:
                return prim.getAsString();
            case NUMBER:
                Number num = prim.getAsNumber();
                if (Math.ceil(num.doubleValue()) == num.longValue())
                    return num.longValue();
                else {
                    return num.doubleValue();
                }
            default:
                return null;
        }
    }
    return null;
}
