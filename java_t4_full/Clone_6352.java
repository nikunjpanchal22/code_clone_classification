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
    for (ListIterator<Entity> it = entities.listIterator(); it.hasNext(); ) {
        Entity e = it.next();
        e.tick(delta);
        if(e.checkStrength()){
            it.remove();
            break;
        }
    }
    player.tick(delta);
}


