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
    super().__init__()
    self.setLevel(logging.DEBUG)
    self.widget = widget
    self.widget.config(state='disabled')
    for tag, color in [("INFO","black"), ("DEBUG","grey"), 
                       ("WARNING","orange"), ("ERROR","red"), 
                       ("CRITICAL","red")]:
        if tag == "CRITICAL":
            self.widget.tag_config(tag, foreground=color, underline=1)
            continue
        self.widget.tag_config(tag, foreground=color)
    self.red = self.widget.tag_configure("red", foreground="red")


