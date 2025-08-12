def __init__(self) :
	self.root = Tk.Tk()
	self.root.wm_title("Fibonacci Calculator")
	self.root.wm_iconbitmap("@icon2.xbm")
	Tk.Label(self.root, text = "Set the digit number you want.").pack()
	self.digits = Tk.StringVar()
	Tk.Entry(self.root, textvariable = self.digits).pack()
	Tk.Button(self.root, text = "Calculate", command = self.clicked).pack()
	self.result = Tk.Label(self.root, text = " ")
	self.result.pack()
	self.root.mainloop()





def __init__(self):
    self.root = tk.Tk()
    self.root.title("Fibonacci Calculator")
    self.root.iconbitmap("@icon2.xbm")
    tk.Label(self.root, text="Enter the Fibonacci sequence digit").grid(row=0, column=0)
    self.value = tk.StringVar()
    tk.Entry(self.root, textvariable=self.value).grid(row=1, column=0)
    tk.Button(self.root, text="Compute", command=self.calculate).grid(row=2, column=0)
    self.label = tk.Label(self.root, text="")
    self.label.grid(row=3, column=0)


