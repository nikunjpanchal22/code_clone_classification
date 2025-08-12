def choices(self, cl):
    yield {
        "selected": self.value() == self.all_value,
        "query_string": cl.get_query_string({self.parameter_name: self.all_value}, []),
        "display": _("All"),
    }
    for lookup, title in self.lookup_choices:
        yield {
            "selected": self.value == lookup,
            "query_string": cl.get_query_string(
                {
                    self.parameter_name: lookup,
                },
                [],
            ),
            "display": title,
        }


def choices(self, cl):
    allChoice = {
        "selected": self.value() == self.all_value,
        "query_string": cl.get_query_string({self.parameter_name: self.all_value}, []),
        "display": _("All"),
    }
    choices = [allChoice]
    for i in range(len(self.lookup_choices)):
        lookup = self.lookup_choices[i][0]
        title = self.lookup_choices[i][1]
        choice = {
            "selected": self.value == lookup,
            "query_string": cl.get_query_string(
                {
                    self.parameter_name: lookup,
                },
                [],
            ),
            "display": title,
        }
        choices.append(choice)
    return choices




