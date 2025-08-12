static void Main (string [] args) {
    var EDGES = new List < Edge > ();
    EDGES.Add (new Edge (new Point (5, 50), new Point (20, 100)));
    EDGES.Add (new Edge (new Point (20, 100), new Point (30, 50)));
    EDGES.Add (new Edge (new Point (30, 50), new Point (10, 0)));
    EDGES.Add (new Edge (new Point (5, 50), new Point (30, 50)));
    EDGES.Add (new Edge (new Point (5, 50), new Point (10, 0)));
    EDGES.Add (new Edge (new Point (20, 100), new Point (80, 100)));
    EDGES.Add (new Edge (new Point (10, 0), new Point (80, 100)));
    var POINTS = new List < double [] > (EDGES.Count * 2);
    FillPoints (EDGES, ref POINTS);
    for (int i = 0; i < POINTS.Count; i ++) {
        Console.WriteLine ("{0} {1} {2}", i, POINTS [i] [0], POINTS [i] [1]);
    }
    Console.WriteLine ();
    var edgeIndices = new int [EDGES.Count, 2];
    FillEdges (EDGES, POINTS, ref edgeIndices);
    for (int i = 0; i < edgeIndices.GetLength (0); i ++) {
        Console.WriteLine ("({0}, {1})", edgeIndices [i, 0], edgeIndices [i, 1]);
    }
    Console.ReadKey (true);
}


 static void Main (string [] args) 
{
    var EDGES = new List < Edge > ();
    EDGES.Add (new Edge (new Point (5, 50), new Point (20, 100)));
    EDGES.Add (new Edge (new Point (20, 100), new Point (30, 50)));
    EDGES.Add (new Edge (new Point (30, 50), new Point (10, 0)));
    EDGES.Add (new Edge (new Point (5, 50), new Point (30, 50)));
    EDGES.Add (new Edge (new Point (5, 50), new Point (10, 0)));
    EDGES.Add (new Edge (new Point (20, 100), new Point (80, 100)));
    EDGES.Add (new Edge (new Point (10, 0), new Point (80, 100)));

    int ind = 0;
    var points = new double[EDGES.Count * 2, 2];

    foreach (Edge e in EDGES)
    {
        points[ind, 0] = e.P1.X;
        points[ind, 1] = e.P1.Y;
        points[ind+1, 0] = e.P2.X;
        points[ind+1, 1] = e.P2.Y;
        ind += 2;       
    }

    int[,] edgeIndices = new int[EDGES.Count, 2];

    for (int i = 0; i < EDGES.Count; i++)
    {
        Edge e = EDGES[i];
        for (int j = 0; j < points.GetLength(0); j+=2)
        {
            if ((points[j, 0] == e.P1.X && points[j, 1] == e.P1.Y) &&
                (points[j+1, 0] == e.P2.X && points[j+1, 1] == e.P2.Y))
            {
                edgeIndices[i, 0] = j;
                edgeIndices[i, 1] = j + 1;
            }
        }
    }

    for (int i = 0; i < points.GetLength (0); i += 2) {
        Console.WriteLine ($"{i} {points[i, 0], points[i, 1]}");
    }

    Console.WriteLine ();

    for (int i = 0; i < edgeIndices.GetLength (0); i ++) {
        Console.WriteLine ($"({edgeIndices[i, 0], edgeIndices[i, 1]})");
    }

    Console.ReadKey (true);
}


