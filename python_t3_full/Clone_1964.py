def touch_value(self, stack, frame) :
	assert self.pushes == 0
	for i in range(self.pops) :
		stack.pop()



def touch_value(self, stack, frame):
    assert self.pushes == 0
    if len(stack) >= self.pops:
        for _ in range(self.pops):
            stack.pop()
    else:
        print("Too few items on stack.")




