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
    Entity removeEntity = entities.parallelStream().peek(e -> e.tick(delta)).filter(Entity::checkStrength).findAny().orElse(null);
    if(removeEntity != null) entities.remove(removeEntity);
    player.tick(delta);
}


