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
   Predicate<Entity> isWeak = e -> {
       e.tick(delta);
       return e.checkStrength();
   };
   entities.removeIf(isWeak);
   player.tick(delta);
}


