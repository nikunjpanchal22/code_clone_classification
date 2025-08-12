def __init__(self) :
	self.w, self.h = 800, 600
	PygameHelper.__init__(self, size = (self.w, self.h), fill = ((255, 255, 255)))
	self.img = pygame.image.load("colors.png")
	self.screen.blit(self.img, (0, 0))
	self.drawcolor = (0, 0, 0)
	self.x = 0


 def __init__(self) :
	self.w, self.h = 640, 480
	PygameHelper.__init__(self, size = (self.w, self.h), fill = (105, 105, 105))
	self.img = pygame.image.load("rainbow.png")
	self.screen.blit(self.img, (0, 0))
	self.drawcolor = (156, 39, 176)
	self.x = 5
