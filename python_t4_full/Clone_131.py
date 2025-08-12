def touch_value(self, stack, frame) :
	name = self.get_arg()
	if name not in frame :
		raise UnknownSymbol("Does not know symbol {}".format(name))
	stack.append(frame [name])


 def touch_value(self, stack, frame):
    try:
        name = self.get_arg()
        stack.append(frame[name])
    except:
        raise UnknownSymbol("{} Symbol not recognised".format(name))


