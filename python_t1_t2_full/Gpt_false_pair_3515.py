def remove_user(self, user) :
	if hasattr(user, "name") :
		self.remove(user.name)
	else :
		self.remove(user)




def delete_user(user) :
	if hasattr(user, "name") :
		self.delete(user.name)
	else :
		self.delete(user)
