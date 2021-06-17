class Box{
    double width;
    double length;
    double height;
}

class BoxDemo{
    public static void main(String[] args) {
        Box myBox = new Box();
        double w = myBox.width = 10;
        double l = myBox.length = 11;
        double h = myBox.height = 12;

        double vol = w * h * l;
        
        System.out.println("The volume of length " + l + ", width " + w + " and height " + h + " is " + vol + ".");
    }
}