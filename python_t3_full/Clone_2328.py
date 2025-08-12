def backspace(self) :
	self.current = self.current [0 : len(self.current) - 1]
	if self.current == "" :
		self.new_num = True
		self.current = "0"
	self.dsiplay(self.current)



 

def backspace(self):
    self.current = self.current[0:-1]
    if self.current == '':
        self.new_num = True
        self.current = "0"


