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


 

public void tick(float delta) {
    entities.removeIf(entity -> {
        entity.tick(delta);
        return entity.checkStrength();
    });
    player.tick(delta);
}


