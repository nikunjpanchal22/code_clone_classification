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
    int index = 0;
    boolean isRemoved = false;
    for (int i = 0; i < entities.size(); i++) {
        entities.get(i).tick(delta);
        if (!isRemoved && entities.get(i).checkStrength()) {
            index = i;
            isRemoved = true;
        }
    }
    if (isRemoved) entities.remove(index);
    player.tick(delta);
}


