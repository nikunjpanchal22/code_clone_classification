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


    default_fg = "red"
    for tag in ["INFO", "DEBUG", "WARNING", "ERROR", "CRITICAL"]:
        fg_color = default_fg if tag in ["ERROR", "CRITICAL"] else tag.lower()
        underline = 1 if tag == "CRITICAL" else None
        self.widget.tag_config(tag, foreground=fg_color, underline=underline)
    self.red = self.widget.tag_configure("red", foreground="red")




def __init__(self, widget):
    logging.Handler.__init__(self)
    self.setLevel(logging.DEBUG)


