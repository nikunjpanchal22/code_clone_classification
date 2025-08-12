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


    colors = ["black", "grey", "orange", "red", "red"]
    for i in range(len(tags)):
        self.widget.tag_config(tags[i], foreground=colors[i]) if tags[i] != "CRITICAL" else \
        self.widget.tag_config(tags[i], foreground=colors[i], underline=1)
    self.red = self.widget.tag_configure("red", foreground="red")




def __init__(self, widget):
    logging.Handler.__init__(self)
    self.setLevel(logging.DEBUG)
    self.widget = widget


