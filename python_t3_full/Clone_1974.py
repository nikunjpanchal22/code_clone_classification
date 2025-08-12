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


    return value




def _safe_eval(expr, fn_and_consts = {}, check_compiling = True):
    assert len(expr) < 1024
    if check_compiling:
        check_for_pow(expr)
    eval_code = compile(expr, '', 'eval')
    ops = disassemble(eval_code)
    assert len(ops) < 1024
    value_stack = []


