def __init__(self) :
	platform = pyglet.window.get_platform()
	display = platform.get_default_display()
	self.screen = display.get_default_screen()


 def __init__(self):
	platform = pyglet.window.get_platform()
	display = platform.default_display
	self.screen = display.default_screen


