def touch_value(self, stack, frame) :
	assert self.pushes == 0
	for i in range(self.pops) :
		stack.pop()



def touch_value(self, stack, frame):
    assert self.pushes == 0
    stack[:] = list(itertools.islice(stack, len(stack) - self.pops))




