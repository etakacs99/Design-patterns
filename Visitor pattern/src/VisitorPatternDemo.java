public class VisitorPatternDemo {
    public static void main(String[] args) {
        Zoo animals = new ZooKeeper();
        animals.accept(new FamilyVisitor());
    }
}
