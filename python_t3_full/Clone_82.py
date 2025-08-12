def __init__(self, pos, angle = 0) :
	super().__init__()
	self.image_inactive = pg.transform.rotate(CHECKPOINT_IMG, angle)
	self.image_active = pg.transform.rotate(CHECKPOINT2_IMG, angle)
	self.image = self.image_inactive
	self.rect = self.image.get_rect(center = pos)
	self.mask = pg.mask.from_surface(self.image)


 def __init__(self, pos, angle=0):
	super().__init__()
	self.image_inactive = pg.transform.flip(CHECKPOINT_IMG, angle, 0)
	self.image_active = pg.transform.flip(CHECKPOINT2_IMG, angle, 0)
	self.image = self.image_inactive
	self.rect = self.image.get_rect(bottomleft=pos)
	self.mask = pg.mask.from_surface(self.image)


