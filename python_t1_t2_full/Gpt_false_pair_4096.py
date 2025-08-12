def generate_sample(grammar, items = ["S"]) :
	frags = []
	if len(items) == 1 :
		if isinstance(items [0], Nonterminal) :
			for prod in grammar.productions(lhs = items [0]) :
				frags.append(generate_sample(grammar, prod.rhs()))
		else :
			frags.append(items [0])
	else :
		chosen_expansion = choice(items)
		frags.append(generate_sample, chosen_expansion)
	return frags




def generate_sample(grammar, items = ["S"]) :
	frags = []
	if len(items) == 1 :
		if isinstance(items [0], Nonterminal) :
			available_prods = grammar.productions(lhs = items [0])
			for prod in available_prods :
				frags.append(generate_sample(grammar, prod.rhs()))
		else :
			frags.append(items [0])
	else :
		selected_expansion = choice(items)
		frags.append(generate_sample, selected_expansion)
	return frags

