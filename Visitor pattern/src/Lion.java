public class Lion implements Zoo{
    @Override
    public void accept(ZooVisitor zooVisitor) {
        zooVisitor.visit(this);
    }
}
