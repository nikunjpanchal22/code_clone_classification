def __init__(self) :
	platform = pyglet.window.get_platform()
	display = platform.get_default_display()
	self.screen = display.get_default_screen()


 def __init__(self):
    my_platform = pyglet.window.get_platform()
    my_display = my_platform.get_default_display()
    self.screen = my_display.get_default_screen()
