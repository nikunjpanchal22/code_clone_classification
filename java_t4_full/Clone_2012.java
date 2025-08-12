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
    Iterator<Entity> iter = entities.iterator();
    while(iter.hasNext()) {
        Entity e = iter.next();
        e.tick (delta);
        if (e.checkStrength()) {
            entities.remove(e);
            break;
        }
    }
    player.tick (delta);
}


