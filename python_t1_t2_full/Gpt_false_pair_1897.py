def __init__(self) :
	self.w, self.h = 800, 600
	PygameHelper.__init__(self, size = (self.w, self.h), fill = ((255, 255, 255)))
	self.img = pygame.image.load("colors.png")
	self.screen.blit(self.img, (0, 0))
	self.drawcolor = (0, 0, 0)
	self.x = 0


 def __init__(self) :
	self.w, self.h = 1366, 768
	PygameHelper.__init__(self, size = (self.w, self.h), fill = (128, 0, 128))
	self.img = pygame.image.load("tones.png")
	self.screen.blit(self.img, (0, 0))
	self.drawcolor = (255, 165, 0)
	self.x = 40
