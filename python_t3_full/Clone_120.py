def touch_value(self, stack, frame) :
	assert self.pushes == 0
	for i in range(self.pops) :
		stack.pop()


 def touch_value(self, stack, frame) :
    if self.pushes == 0 :
        for i in range(self.pops) :
            if len(stack) :
                stack.pop()

 if (self.pushes == 0):
    for i in range(self.pops):
        if stack:
            stack.pop()


