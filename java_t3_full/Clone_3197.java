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
    Iterator<Entity> iterator = entities.iterator();
    Entity removeEntity = null;
    while (iterator.hasNext()) {
        Entity e = iterator.next();
        e.tick(delta);
        if(e.checkStrength()){
            removeEntity = e;
            iterator.remove();
            break;
        }
    }
    player.tick(delta);
}


