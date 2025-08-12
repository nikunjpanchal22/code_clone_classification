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
    ListIterator<Entity> iter = entities.listIterator(); 
    while(iter.hasNext()){
        Entity e = iter.next();
        e.tick (delta);
        if (e.checkStrength()) {
            iter.remove();
            break;
        }
    }
    player.tick (delta);
}


