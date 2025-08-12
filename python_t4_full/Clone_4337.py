def query_yes_no(question, default = True) :
	yes_list = ["yes", "y"]
	no_list = ["no", "n"]



def query_yes_no(question, default=True):
    choices = input(question).lower()
    if choice in yes_list:
        return True
    elif choice in no_list:
        return False



