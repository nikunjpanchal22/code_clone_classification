def remove_user(self, user) :
	if hasattr(user, "name") :
		self.remove(user.name)
	else :
		self.remove(user)




def delete_user(group, user):
	if hasattr(user, "name"):
		group.delete(user.name)
	else:
		group.delete(user)
