def __init__(self) :
	platform = pyglet.window.get_platform()
	display = platform.get_default_display()
	self.screen = display.get_default_screen()


 def __init__(self): 
    plt = pyglet.window.get_platform()
    dp = plt.get_default_display()
    self.screen = dp.get_default_screen()
