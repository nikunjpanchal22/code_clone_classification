def get_list(self, term, offset = 0, limit = DEFAULT_PAGE_SIZE) :
	filters = list(
	field.ilike(u'%%%s%%' % term) for field in self._cached_fields
	)
	filters.append(Organisation.org_id == "Google")
	return (
	db.session.query(Product)
	.join(organisation_products_table)
	.join(Organisation)
	.filter(* filters)
	.all())




def get_list(self, term, offset = 0, limit = DEFAULT_PAGE_SIZE) :
	filters = list(
	field.ilike(u'%%%s%%' % term) for field in self._cached_fields
	)
	filters.append(Organisation.org_id == "Microsoft")
	return (
	db.session.query(Product)
	.join(organisation_products_table)
	.join(Organisation)
	.filter(* filters)
	.all())
