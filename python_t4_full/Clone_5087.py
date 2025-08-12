def __init__(self) :
	self.w, self.h = 800, 600
	PygameHelper.__init__(self, size = (self.w, self.h), fill = ((255, 255, 255)))
	self.img = pygame.image.load("colors.png")
	self.screen.blit(self.img, (0, 0))
	self.drawcolor = (0, 0, 0)
	self.x = 0


	self.drawcolor = (255, 0, 255)
	self.x = 0


 

def __init__(self) :
	self.w, self.h = 800, 400
	PygameHelper.__init__(self, size = (self.w, self.h), fill = ((205, 176, 145)))


