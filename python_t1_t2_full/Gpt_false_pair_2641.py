def __str__(self) :
	left_str = self.left.__str__()
	right_str = self.right.__str__()
	op_str = self.symbol
	if self.left.precedence() > self.precedence() :
		left_str = '(' + left_str + ')'
	if self.right.precedence() > self.precedence() :
		right_str = '(' + right_str + ')'
	if operators [self.symbol] ['prec'] > = 30 :
		op_str = ' ' + op_str + ' '
	return left_str + op_str + right_str




def __str__(self) :
	left_str = self.left.__str__()
	right_str = self.right.__str__()
	op_str = self.symbol
	if self.left.precedence() > self.precedence() :
		left_str = '[' + left_str + ']'
	if self.right.precedence() > self.precedence() :
		right_str = '[' + right_str + ']'
	if operators [self.symbol] ['prec'] > = 30 :
		op_str = ' ' + op_str + ' '
	return left_str + op_str + right_str


