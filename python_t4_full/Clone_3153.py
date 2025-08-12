def _safe_eval(expr, functions_and_constants = {}, check_compiling_input = True) :
	assert len(expr) < 1024
	if check_compiling_input :
		check_for_pow(expr)
	code = compile(expr, '', 'eval')
	ops = disassemble(code)
	assert len(ops) < 1024
	stack = []
	for op in ops :
		value = op.touch_value(stack, functions_and_constants)
	return value


    stack = []
    for op in operations :
        value = op.touch_value(stack, operations_list)
    return value




def _safe_eval(expression, fc={} , check=True):
    assert len(expression)<1024
    if check:
        check_for_pow(expression)
    ev_code = compile(expression,'','eval')


