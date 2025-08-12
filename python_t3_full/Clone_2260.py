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


 

def __init__(self):
    super().__init__()
    self.box = queue.Queue()
    self.text_list = tk.Listbox(self, width = 25, height=6)
    self.progress = ttk.Progressbar(self, orient = 'horizontal', length = 350, mode = 'determinate')
    self.btn = tk.Button(self, text = "Start", command = self.start)
    self.text_list.pack(padx = 10, pady = 10)
    self.progress.pack(padx = 10, pady = 10)
    self.btn.pack(padx = 10, pady = 10)


