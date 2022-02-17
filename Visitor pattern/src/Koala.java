public class Koala implements Zoo{
    @Override
    public void accept(ZooVisitor zooVisitor) {
        zooVisitor.visit(this);
    }
}
