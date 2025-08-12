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


    self.root.mainloop()




def __init__(self):
    self.master = Tk()
    self.master.title("Fibonacci Calculator")
    Label(self.master, text="Enter the number of digits").pack()
    self.digits = StringVar()
    Entry(self.master, textvariable=self.digits).pack()
    Button(self.master, text="Calculate", command=self.calculate).pack()


