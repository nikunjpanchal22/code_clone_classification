def query_yes_no(question, default=True):
    yes_list = ["yes", "y"]
    no_list = ["no", "n"]




 def query_yes_no(question, default=True):
    valid = False

    while valid == False:
        print(question)
        answer = input("yes/no (y/n) :")

        if answer.lower() == "yes" or answer.lower() == "y":
            valid = True
            return True
        elif answer.lower() == "no" or answer.lower() == "n":
            valid = True
            return False
        elif answer == "" and default:
            valid = True
            return True
        elif answer == "" and not default:
            valid = True
            return False

        else:
            print("Invalid input")


