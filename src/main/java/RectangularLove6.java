/**
 * Created by kmg on 2016-01-27.
 */
public class RectangularLove6 {

    public static class Rectangle {

        // coordinates of bottom left corner
        Integer x;
        Integer y;

        // dimensions
        Integer width;
        Integer height;

        public Rectangle(Integer x, Integer y, Integer width, Integer height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public Rectangle() {
        }

        public String toString() {
            return String.format("(%d, %d, %d, %d)", x, y, width, height);
        }
    }

    public static void main(String[] args) {


    }


    static Rectangle intersection(int x1, int y1, int x2, int y2, int height1, int width1, int height2, int width2) {


        int highestStartPointX = Math.max(x1, x2);
        int lowestEndPointX = Math.min(x1 + width1, x2 + width2);

        int highestStartPointY = Math.max(y1, y2);
        int lowestEndPointY = Math.min(y1 + height1, y2 + height2);

        if (highestStartPointX < lowestEndPointX && highestStartPointY < lowestEndPointY) {
            return new Rectangle(highestStartPointX, highestStartPointY, lowestEndPointX - highestStartPointX, lowestEndPointY - highestStartPointY);
        }

        return new Rectangle();
    }


    /**
     *   public class RangeOverlap {

     Integer startPoint;
     Integer length;

     public RangeOverlap(Integer startPoint, Integer length) {
     this.startPoint = startPoint;
     this.length = length;
     }
     }

     public RangeOverlap findRangeOverlap(int point1, int length1, int point2, int length2) {

     // Find the highest start point and lowest end point.
     // The highest ("rightmost" or "upmost") start point is
     // the start point of the overlap.
     // The lowest end point is the end point of the overlap.
     int highestStartPoint = Math.max(point1, point2);
     int lowestEndPoint = Math.min(point1 + length1, point2 + length2);

     // Return (null, null) if there is no overlap.
     if (highestStartPoint >= lowestEndPoint) {
     return new RangeOverlap(null, null);
     }

     // Compute the overlap length.
     int overlapLength = lowestEndPoint - highestStartPoint;

     return new RangeOverlap(highestStartPoint, overlapLength);
     }

     public Rectangle findRectangularOverlap(Rectangle rect1, Rectangle rect2) {

     // get the x and y overlap points and lengths
     RangeOverlap xOverlap = findRangeOverlap(rect1.x, rect1.width, rect2.x, rect2.width);
     int overlapWidth = xOverlap.length;

     RangeOverlap yOverlap = findRangeOverlap(rect1.y, rect1.height, rect2.y, rect2.height);
     int overlapHeight = yOverlap.length;

     Rectangle rectangularOverlap = new Rectangle();

     if (overlapWidth < 1 || overlapHeight < 1) {
     // return null rectangle if there is no overlap
     return new Rectangle();
     }

     return new Rectangle(xOverlap.startPoint, yOverlap.startPoint, overlapWidth, overlapHeight);
     }
     */


}
