def get_or_create(session, model, ** kwargs) :
	instance = session.query(model).filter_by(** kwargs).first()
	if not instance :
		instance = model(** kwargs)
		session.add(instance)
	return instance






def find_or_create(session, model, **kwargs):
	entity = session.query(model).filter_by(**kwargs).scalar()
	if entity is None:
		entity = model(**kwargs)


