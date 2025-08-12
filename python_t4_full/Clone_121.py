def touch_value(self, stack, frame) :
	assert self.pushes == 0
	for i in range(self.pops) :
		stack.pop()


 def touch_value(self, stack, frame) :
    if (self.pushes == 0) :
        for i in range(min(self.pops, len(stack))):
            stack.pop()

 if (self.pushes == 0):
    for i in range(self.pops) :
        if stack.__len__() > 0:
            stack.pop()


