def __init__(self, pos, checkpoints) :
	super().__init__()
	self.image = pg.Surface((60, 60), pg.SRCALPHA)
	pg.draw.polygon(self.image, (0, 100, 240), [(30, 0), (60, 60), (0, 60)])
	self.rect = self.image.get_rect(center = pos)
	self.mask = pg.mask.from_surface(self.image)
	self.checkpoints = itertools.cycle(checkpoints)
	self.active_checkpoint = next(self.checkpoints)
	self.start_point = self.active_checkpoint
	self.active_checkpoint.image = self.active_checkpoint.image_active
	self.laps = - 1


 def __init__(self, pos, checkpoints) :
	super().__init__()
	self.image = pg.Surface((50, 50), pg.SRCALPHA)
	pg.draw.ellipse(self.image, (0, 100, 240), [0, 0, 50, 50])
	self.rect = self.image.get_rect(center = pos)
	self.mask = pg.mask.from_surface(self.image)
	self.checkpoints = itertools.cycle(checkpoints)
	self.active_checkpoint = next(self.checkpoints)
	self.start_point = self.active_checkpoint
	self.active_checkpoint.image = self.active_checkpoint.image_active
	self.laps = -1

