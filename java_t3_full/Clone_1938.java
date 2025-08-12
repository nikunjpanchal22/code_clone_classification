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


 public void tick (float delta){
    List<Entity> removeEntities = new ArrayList<>();
	for (Entity e : entities) {
		e.tick (delta);	
		if (e.checkStrength()) {
			removeEntities.add(e);
		}
	}	
	for (Entity removeEntity : removeEntities) {	
		entities.remove(removeEntity);	
	}
	player.tick (delta);
}


