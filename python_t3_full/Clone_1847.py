def __init__(self) :
	platform = pyglet.window.get_platform()
	display = platform.get_default_display()
	self.screen = display.get_default_screen()


 def __init__(self):
    myplatform = pyglet.window.get_platform()
    mydisplay = myplatform.get_default_display()
    self.screen = mydisplay.default_screen


