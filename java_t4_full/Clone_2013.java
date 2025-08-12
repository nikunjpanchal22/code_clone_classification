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
    for (Iterator<Entity> iterator = entities.iterator(); iterator.hasNext(); ) {
        Entity e = iterator.next();
        e.tick (delta);
        if (e.checkStrength()) {
            entities.remove(e);
            break;
        }
    }
    player.tick (delta);

}


