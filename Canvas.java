import java.util.List;

public class Canvas {
    List<Point> Points;
    Canvas()
    {
        Points = new List<Point>;
    }

    public void addPoint(Point toAdd)
    {
        Points.add(toAdd);
    }
    public void deletePoint(Point toDelete)
    {
        if(Points.contains(toDelete))
        {
            Points.remove(toDelete);
        }
    }
    public void moveAllPoints()
    {
        for(int i=0;i<Points.size();i++)
        {
            if(i%2==0)
                Points.get(i).move('L','D');
            else
                Points.get(i).move('R','U');

        }
    }
    public void middlePoint()
    {
        double sumx=0,sumy=0;
        for(int i=0;i<Points.size();i++)
        {
            sumx+=Points.get(i).x;
            sumy+=Points.get(i).y;
        }
        System.out.println("Middle point is x: "+sumx/Points.size() +" and y: "+sumy/Points.size());
    }

}
