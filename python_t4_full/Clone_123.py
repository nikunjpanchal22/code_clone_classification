def touch_value(self, stack, frame) :
	TOS1, TOS = stack [- 2 :]
	print (TOS1, TOS)
	if abs(TOS1) > BadValue.MAX_ALLOWED_VALUE or abs(TOS) > BadValue.MAX_ALLOWED_VALUE :
		raise BadValue("The value for exponent was too big")
	stack [- 2 :] = [TOS1 ** TOS]


 def touch_value(self, stack, frame) :
    if len(stack) < 2:
        raise BadValue("Stack too small! Two values expected on the stack")
    TOS1, TOS = stack [- 2 :]
    print (TOS1, TOS)
    if abs(TOS1) > BadValue.MAX_ALLOWED_VALUE or abs(TOS) > BadValue.MAX_ALLOWED_VALUE :
        raise BadValue("The value for exponent was too big")
    result =  1
    while TOS > 0 :
        result = TOS1 * result
        TOS = TOS - 1        
    stack [- 2 :] = [result]


