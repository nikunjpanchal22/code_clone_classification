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




def __init__(self, * args, ** kwargs) : 
	tk.Tk.__init__(self, * args, ** kwargs)
	self.frame = tk.Frame(self)
	self.frame.pack(side = "top", fill = "both", expand = True)

	self.label = tk.Label(self, text = "Hello, world")
	self.label.pack(in_ = self.frame)

	button1 = tk.Button(self, text = "Click to hide label", command = self.label)
	button1.pack(in_ = self.frame)
	button2 = tk.Button(self, text = "Click to show label", command = self.label)
	button2.pack(in_ = self.frame)


