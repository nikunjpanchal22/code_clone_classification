def touch_value(self, stack, frame) :
	assert self.pushes == 0
	for i in range(self.pops) :
		stack.pop()



def touch_value(self, stack, frame):
    assert self.pushes == 0
    if self.pops:
        stack.pop()
        self.pops -= 1
        self.touch_value(stack, frame)




