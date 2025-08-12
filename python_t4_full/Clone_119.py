def touch_value(self, stack, frame) :
	assert self.pushes == 0
	for i in range(self.pops) :
		stack.pop()


 def touch_value(self, stack, frame) :
    if (self.pushes == 0) :
        for i in range(self.pops) :
            pop_value = stack.pop()
            frame.append(pop_value)

 if (self.pushes == 0):
    while stack.__len__() > 0 and self.pops > 0:
        stack.pop()
        self.pops -= 1


