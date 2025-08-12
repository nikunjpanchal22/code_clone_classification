def __init__(self) :
	platform = pyglet.window.get_platform()
	display = platform.get_default_display()
	self.screen = display.get_default_screen()


 def __init__(self): 
	self.platform = pyglet.window.get_default_platform()
	self.display = self.platform.get_default_display()
	self.screen = self.display.get_default_screen()


