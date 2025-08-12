def test2():
    import json
    import time


def test2():
    import json
    import time

    time_start = time.time()
    data = []
    with open("data.csv", "r") as f:
        reader = csv.DictReader(f)
        for row in reader:
            data.append(row)
    all_point_sets = [Point(*xy) for xy in zip(*[i.values() for i in data])]
    time_end = time.time()
    print("total time: ", (time_end - time_start))




