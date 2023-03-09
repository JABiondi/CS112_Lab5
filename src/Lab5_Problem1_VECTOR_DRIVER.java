public class Lab5_Problem1_VECTOR_DRIVER {
    public static void main(String[] args) {
        Vector myVector = new Vector(4, 6);
        System.out.println(myVector.getX());
        System.out.println(myVector.getY());
        System.out.println(myVector.getMagnitude());
        System.out.println(myVector.scale(5).getX());
        System.out.println(myVector.scale(5).getY());
        System.out.println(myVector.scale(5).getMagnitude());
        System.out.println(myVector.add(myVector).getX());
        System.out.println(myVector.add(myVector).getY());
        System.out.println(myVector.add(2, 3).getX());
        System.out.println(myVector.add(2, 3).getY());
    }
}
