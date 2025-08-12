def touch_value(self, stack, frame) :
	assert self.pushes == 0
	for i in range(self.pops) :
		stack.pop()


 def touch_value(self, stack, frame) :
    if (self.pushes == 0) :
        index = len(stack) - self.pops
        stack[:] = stack[:index]

 if (self.pushes == 0):
    stack[:] = [stack.pop() for i in range(self.pops)]


