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


	self.image = pg.Surface((80, 80), pg.SRCALPHA)
	pg.draw.ellipse(self.image, (125, 50, 5), [0, 0, 60, 80]) 
	self.rect = self.image.get_rect(center = pos)
	self.mask = pg.mask.from_surface(self.image)
	self.checkpoints = itertools.cycle(checkpoints)
	self.active_checkpoint = next(self.checkpoints)
	self.active_checkpoint.image = self.active_checkpoint.image_active
	self.laps = -3


def __init__(self, pos, checkpoints) :
	super().__init__()
	self.image = pg.Surface((90, 90), pg.SRCALPHA)
	pg.draw.arc(self.image, (0, 0, 255), (0, 0, 70, 70), 0, math.pi/2)
	self.rect = self.image.get_rect(center = pos)
	self.mask = pg.mask.from_surface(self.image)
	self.checkpoints = itertools.cycle(checkpoints)
	self.start_point = self.active_checkpoint
	self.active_checkpoint = next(self.checkpoints)
	self.active_checkpoint.image = self.active_checkpoint.image_active


