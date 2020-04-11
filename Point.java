class Point {
	String id
	double x,y;
    String color;
    Point(String id,double x,double y,String color)
    {
        this.id = id;
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public String getID()
    {
        return id;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public String getColoro()
    {
        return color;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move (char xDirection, char yDirection) {
		if(xDirection=='L')
		    x-=1;
		else if(xDirection=='R')
		    x+=1;
		if(yDirection=='U')
		    y+=1;
		else if(yDirection=='D')
		    y-=1;
	}

	public void draw () {
        System.out.println("The dot with id: "+id+ " is at x: " +x+" and y: "+y);
	}



}