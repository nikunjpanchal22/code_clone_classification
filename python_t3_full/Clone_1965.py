def touch_value(self, stack, frame) :
	assert self.pushes == 0
	for i in range(self.pops) :
		stack.pop()



def touch_value(self, stack, frame):
    assert self.pushes == 0
    try:
        for _ in range(self.pops):
            stack.pop()
    except IndexError:
        print("Stack is empty.")




