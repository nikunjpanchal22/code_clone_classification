def __init__(self) :
	tk.Tk.__init__(self)
	self.queue = queue.Queue()
	self.listbox = tk.Listbox(self, width = 20, height = 5)
	self.progressbar = ttk.Progressbar(self, orient = 'horizontal',
	length = 300, mode = 'determinate')
	self.button = tk.Button(self, text = "Start", command = self.spawnthread)
	self.listbox.pack(padx = 10, pady = 10)
	self.progressbar.pack(padx = 10, pady = 10)
	self.button.pack(padx = 10, pady = 10)


    self.select_box.pack(padx = 10, pady = 10)
    self.progress_indicator.pack(padx = 10, pady = 10)
    self.click_button.pack(padx = 10, pady = 10)

 

def __init__(self):
    super().__init__()
    self.q = queue.Queue()
    self.lbox = tk.Listbox(self, width = 15, height = 5)


