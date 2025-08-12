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


    tk.Button(self.root, text="Calculate", command=self.calculate_fibonacci).pack()
    self.result_label = tk.Label(self.root)
    self.result_label.pack()
    self.root.mainloop()




def __init__(self):
    self.root = Tk()
    self.root.title("Fibonacci Sequence Calculator")
    Label(self.root, text="Enter the term number: ").pack()


