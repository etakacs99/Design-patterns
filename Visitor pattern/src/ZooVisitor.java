public interface ZooVisitor {
    public void visit(ZooKeeper keeper);
    public void visit(Penguin penguin);
    public void visit(Koala koala);
    public void visit(Monkey monkey);
    public void visit(Lion lion);
}
