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
    result = []
    result.append(
        {
            "selected": self.value() == self.all_value,
            "query_string": cl.get_query_string(
                {self.parameter_name: self.all_value}, []
            ),
            "display": _("All"),
        }
    )

    for item in self.lookup_choices:
        lookup = item[0]
        title = item[1]
        result.append(
            {
                "selected": self.value == lookup,
                "query_string": cl.get_query_string(
                    {
                        self.parameter_name: lookup,
                    },
                    [],
                ),
                "display": title,
            }
        )
    return result




