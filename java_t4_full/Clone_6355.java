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
    Entity removeEntity = entities.stream().filter(e -> {
        e.tick(delta);
        return e.checkStrength();
    }).findFirst().orElse(null);
    entities.remove(removeEntity);
    player.tick(delta);
}


