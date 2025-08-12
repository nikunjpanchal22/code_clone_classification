def __init__(self, widget) :
	logging.Handler.__init__(self)
	self.setLevel(logging.DEBUG)
	self.widget = widget
	self.widget.config(state = 'disabled')
	self.widget.tag_config("INFO", foreground = "black")
	self.widget.tag_config("DEBUG", foreground = "grey")
	self.widget.tag_config("WARNING", foreground = "orange")
	self.widget.tag_config("ERROR", foreground = "red")
	self.widget.tag_config("CRITICAL", foreground = "red", underline = 1)
	self.red = self.widget.tag_configure("red", foreground = "red")




def __init__(self, widget) :
	logging.Handler.__init__(self)
	self.setLevel(logging.DEBUG)
	self.widget = widget
	self.widget.config(state = 'disabled')
	self.widget.tag_config("INFO", foreground = "black")
	self.widget.tag_config("DEBUG", foreground = "purple")
	self.widget.tag_config("WARNING", foreground = "brown")
	self.widget.tag_config("ERROR", foreground = "orange")
	self.widget.tag_config("CRITICAL", foreground = "white", underline = 1)
	self.orange = self.widget.tag_configure("orange", foreground = "orange")
