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


static void Main(string[] args) 
{
    var EDGES = new List<Edge>();
    EDGES.Add(new Edge(new Point(5, 50), new Point(20, 100)));
    EDGES.Add(new Edge(new Point(20, 100), new Point(30, 50)));
    EDGES.Add(new Edge(new Point(30, 50), new Point(10, 0)));
    EDGES.Add(new Edge(new Point(5, 50), new Point(30, 50)));
    EDGES.Add(new Edge(new Point(5, 50), new Point(10, 0)));
    EDGES.Add(new Edge(new Point(20,100), new Point(80,100)));
    EDGES.Add(new Edge(new Point(10,0), new Point(80,100)));
    var POINTS = new List<double[]>(EDGES.Count*2);
    FillPoints(EDGES, ref POINTS);
    for (int i = 0; i < POINTS.Count; i++)
    {
        Console.WriteLine("Point {0}: x = {1}, y = {2}", 
                          i, POINTS[i][0], POINTS[i][1]);
    }
    Console.WriteLine();
    var edgeIndices = new int[EDGES.Count, 2];
    FillEdges(EDGES, POINTS, ref edgeIndices);
    for (int i = 0; i < edgeIndices.GetLength(0); i++)
    {
        Console.WriteLine("({0}, {1})", edgeIndices[i, 0], edgeIndices[i, 1]);
    }
    Console.ReadKey(true);
}
