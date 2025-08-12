def __init__(self, opt_name, dest = None, default = True, required = False, help = None) :
	super(ActionFlagWithNo, self).__init__(
	[
	'--' + opt_name [0],
	'--no-' + opt_name [0],
	] + opt_name [1 :],
	dest = (opt_name [0].replace('-', '_') if dest is None else dest),
	const = default,
	nargs = 0,
	required = required,
	help = help
	)


 def __init__(self, opt_name, dest = None, default = True, required = False, help = None) :
    super(ActionFlagWithNo, self).__init__(
	[
	'/' + opt_name [0],
	'/' + opt_name [0],
	] + opt_name [1 :],
	dest = (opt_name [0].replace('-', '_') if dest is None else dest),
	const = default,
	nargs = 0,
	required = required,
	help = help
	)
