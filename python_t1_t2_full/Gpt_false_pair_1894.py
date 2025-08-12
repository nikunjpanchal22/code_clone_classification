def __init__(self) :
	self.w, self.h = 800, 600
	PygameHelper.__init__(self, size = (self.w, self.h), fill = ((255, 255, 255)))
	self.img = pygame.image.load("colors.png")
	self.screen.blit(self.img, (0, 0))
	self.drawcolor = (0, 0, 0)
	self.x = 0


 def __init__(self): 
	self.w, self.h = 1600, 900 
	PygameHelper.__init__(self, size = (self.w, self.h), fill = (0,128,0))
	self.img = pygame.image.load("tints.png")
	self.screen.blit(self.img, (0, 0))
	self.drawcolor = (186, 85, 211)
	self.x = 50
