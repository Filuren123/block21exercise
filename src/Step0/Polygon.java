package Step0;

public class Polygon {
    /*

    TODO: For each step below, named STEP 1..5, do the following:
      a) Draw a UML Class Diagram that describes the codebase statically after (all substeps of)
         the proposed refactoring step.
      b) Draw a UML Object Diagram that describes the system dynamically, after (all substeps of)
         the proposed refactoring step, at a relevant point during execution.
      c) assert: You should not have touched the code before reaching this point.
         Don't proceed unless you've drawn the diagrams.
      d) When, and only when, you've drawn the diagrams: Refactor the code as specified.
      .
      .
      (You can choose in which order to do things, as long as you don't touch the code *before*
      drawing the relevant diagrams. I.e. you could choose to do
           0a ... 5a, then 0b ... 5b, and then 0d ... 5d
        OR 0a + 0b, ..., 5a + 5b, then 0d ... 5d
        OR 0a + 0b + 0d, ..., 5a + 5b + 5d
      Any of these orders is fine, as long as you never do Xd before you've done both Xa and Xb.)
      .
      .
      STEP 0: * The system as it looks right now, before any refactoring steps (and without this
                Step5.Polygon file).
      STEP 1: * Create a new class Step5.Polygon (this file) to hold the variables name and centerPoint
                together. Implement a constructor Step5.Polygon(String,Point).
              * Create instances of this class appropriately in the Step5.DrawPolygons class.
      STEP 2: * Add a paint method to Step5.Polygon. Move all relevant functionality from Step5.DrawPolygons.paint.
      STEP 3: * Simplify the if statement in Step5.Polygon.paint through functional decomposition into
                three separate methods: paintSquare, paintTriangle, paintRectangle
      STEP 4: * Create three subclasses of Step5.Polygon, named Step5.Square, Step5.Triangle, and Step5.Rectangle.
              * Remove all aspects of 'name', polygons should be classified by which
                subclass they belong to.
              * Give each subclass the correct paint method. Simplify the paint methods
                in Step5.DrawPolygons and Step5.Polygon.
      STEP 5: * Make the Step5.Polygon class abstract.
              * Make the constructor Step5.Polygon(Point) private.
              * Create a public constructor Step5.Polygon(int,int) that internally calls the now-private
                Step5.Polygon(Point)
              * Simplify Step5.DrawPolygons by calling the new Step5.Polygon(int,int) constructor instead.

     */

}
