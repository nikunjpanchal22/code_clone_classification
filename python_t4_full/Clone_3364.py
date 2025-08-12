def __init__(self, * args, ** kwargs) :
	tk.Tk.__init__(self, * args, ** kwargs)
	self.frame = tk.Frame(self)
	self.frame.pack(side = "top", fill = "both", expand = True)
	self.label = tk.Label(self, text = "Hello, world")
	button1 = tk.Button(self, text = "Click to hide label",
	command = self.hide_label)
	button2 = tk.Button(self, text = "Click to show label",
	command = self.show_label)
	self.label.pack(in_ = self.frame)
	button1.pack(in_ = self.frame)
	button2.pack(in_ = self.frame)





def __init__(self, * args, ** kwargs):
	tk.Tk.__init__(self, * args, ** kwargs)
	frame = tk.Frame(self)
	frame.pack(side = "top", fill = "both", expand = True)
	self.frame = frame
	label = tk.Label(self, text="Hello, world")
	label.pack(in_ = self.frame)
	self.label = label
	button = tk.Button(self, text="Click to hide label", command=self.hide_label)
	button.pack(in_ = self.frame)
	self.hide_button = button
	button = tk.Button(self, text="Click to show label", command=self.show_label)
	button.pack(in_ = self.frame)


