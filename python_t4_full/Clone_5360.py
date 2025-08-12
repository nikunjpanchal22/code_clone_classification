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





def __init__(self, widget):
    logging.Handler.__init__(self)
    self.setLevel(logging.DEBUG)
    self.widget = widget
    self.widget.config(state='disabled')
    levels = {"INFO":"black","DEBUG":"grey","WARNING":"orange","ERROR":"red","CRITICAL":"red"}
    for key in levels.keys():
        if key == "CRITICAL":
            self.widget.tag_config(key, foreground=levels[key], underline=1)
        else:
            self.widget.tag_config(key, foreground=levels[key])


