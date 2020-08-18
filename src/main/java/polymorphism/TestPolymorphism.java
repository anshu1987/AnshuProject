package polymorphism;

class TestPolymorphism {
    public static void main(String args[]) {
//		Shape s;
        Shape s = new Shape();
        s.draw();
        s = new Rectangle();
        s.draw();
        s = new square();
        s.draw();
        s = new Circl();
        s.draw();

        //Java Runtime Polymorphism with Data Member
        //A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members
        Shape obj = new Rectangle();
        System.out.println(obj.diameter);

    }
}  