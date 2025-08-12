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
    for (int i = 0; i < entities.size(); i++) {
        Entity e = entities.get(i);
        e.tick (delta);
        if (e.checkStrength()) {
            entities.remove(i);
            break;
        }
    }
    player.tick (delta);

} 


