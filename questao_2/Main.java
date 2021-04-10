package questao_2;

public class Main {
    public static void main(String[] args) {
      double valueDistanceMin = 99999;

      Point[] points = {
              new Point(3, 5),
              new Point(4, 6),
              new Point(10, 7),
              new Point(11, 8),
              new Point(8, 3),
              new Point(3, 9),
              new Point(1, 2),
              new Point(5, 4)
      };
      int numberOfPoints = points.length;

      double[][] matrizDistances = new double[numberOfPoints][numberOfPoints];

      for(int i = 0; i < numberOfPoints - 1; i++) {
        for(int j = i+1; j < numberOfPoints; j++) {
          double distance = points[i].distance(points[j]);
          if (valueDistanceMin > distance) {
            valueDistanceMin = distance;
          }
          matrizDistances[i][j] = matrizDistances[j][i] = distance;
        }
      }

      System.out.println("Minimum distance: "+valueDistanceMin);
      for(int i = 0; i < numberOfPoints - 1; i++) {
        for(int j = i+1; j < numberOfPoints; j++) {
          if (valueDistanceMin == matrizDistances[i][j]) {
            System.out.println(String.format("Pair: [%s, %s]",
                    points[i], points[j]));
          }
        }
      }
    }
}
