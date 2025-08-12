def touch_value(self, stack, frame) :
	TOS1, TOS = stack [- 2 :]
	print (TOS1, TOS)
	if abs(TOS1) > BadValue.MAX_ALLOWED_VALUE or abs(TOS) > BadValue.MAX_ALLOWED_VALUE :
		raise BadValue("The value for exponent was too big")
	stack [- 2 :] = [TOS1 ** TOS]


 def touch_value(self, stack, frame) :
    TOS1 = 0
    TOS = 0
    if len(stack) <= 2 :
        print ("There must be at least 2 values on the stack")
        return
    else :
        TOS1, TOS = stack [- 2 :]
    print (TOS1, TOS)
    if abs(TOS1) > BadValue.MAX_ALLOWED_VALUE or abs(TOS) > BadValue.MAX_ALLOWED_VALUE :
        raise BadValue("The value for exponent was too big")
    stack [- 2 :] = [TOS1 ** TOS]


