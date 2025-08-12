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
    Entity[] tempEntities = entities.toArray(new Entity[0]);
    for (int i = 0; i < tempEntities.length; i++) {
        Entity e = tempEntities[i];
        e.tick(delta);
        if(e.checkStrength()){
            entities.remove(e);
            break;
        }
    }
    player.tick(delta);
}


