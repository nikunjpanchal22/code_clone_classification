def __init__(self) :
	self.w, self.h = 800, 600
	PygameHelper.__init__(self, size = (self.w, self.h), fill = ((255, 255, 255)))
	self.img = pygame.image.load("colors.png")
	self.screen.blit(self.img, (0, 0))
	self.drawcolor = (0, 0, 0)
	self.x = 0


 def __init__(self) :
	self.w, self.h = 1280, 800
	PygameHelper.__init__(self, size = (self.w, self.h), fill = (162, 181, 205))
	self.img = pygame.image.load("palette.png")
	self.screen.blit(self.img, (0, 0))
	self.drawcolor = (46, 139, 87)
	self.x = 30
