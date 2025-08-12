def __init__(self) :
	platform = pyglet.window.get_platform()
	display = platform.get_default_display()
	self.screen = display.get_default_screen()


 def __init__(self): 
    p = pyglet.window.get_platform()
    d = p.default_display
    self.screen = d.default_screen


