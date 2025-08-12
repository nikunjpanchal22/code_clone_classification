def __init__(self) :
	self.w, self.h = 800, 600
	PygameHelper.__init__(self, size = (self.w, self.h), fill = ((255, 255, 255)))
	self.img = pygame.image.load("colors.png")
	self.screen.blit(self.img, (0, 0))
	self.drawcolor = (0, 0, 0)
	self.x = 0


 def __init__(self): 
	self.w, self.h = 1680, 1050
	PygameHelper.__init__(self, size = (self.w, self.h), fill = (139, 0, 139))
	self.img = pygame.image.load("hue wheel.png")
	self.screen.blit(self.img, (0, 0))
	self.drawcolor = (34, 139, 34)
	self.x = 80
