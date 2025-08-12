public void tick (float delta) {
    Entity removeEntity = null;
    for (Entity e : entities) {
        e.tick (delta);
        if (e.checkStrength ()) {
            removeEntity = e;
            break;
        }
    }
    if (removeEntity != null) {
        entities.remove (removeEntity);
    }
    player.tick (delta);
}


 

public void tick (float delta) {
    int i = 0;
    for (Entity e : new ArrayList<>(entities)) {
        e.tick(delta);
        if (e.checkStrength()) {
            entities.remove(i);
            break;
        }
        i++;
    }
    player.tick(delta);
}


