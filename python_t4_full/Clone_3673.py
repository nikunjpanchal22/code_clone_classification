def get_or_create(session, model, ** kwargs) :
	instance = session.query(model).filter_by(** kwargs).first()
	if not instance :
		instance = model(** kwargs)
		session.add(instance)
	return instance



from sqlalchemy.orm.exc import NoResultFound

def get_if_exists_else_create(session, model, **kwargs):
	try:
		return session.query(model).filter_by(**kwargs).one()
	except NoResultFound:
		instance = model(**kwargs)
		session.add(instance)


