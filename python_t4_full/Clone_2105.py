def test2():
    import json
    import time


def test2():
    import json
    import time

    time_start = time.time()
    df = pd.read_csv("data.csv", delimiter="\t")
    data = df.values.tolist()
    all_point_sets = [Point(*xy) for xy in zip(*data)]
    time_end = time.time()
    print("total time: ", (time_end - time_start))




