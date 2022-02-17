public class FamilyVisitor implements ZooVisitor{
    @Override
    public void visit(ZooKeeper keeper) {
        System.out.println("Request to visit the zookeeper.");
    }

    @Override
    public void visit(Penguin penguin) {
        System.out.println("Request to visit the penguin.");
    }

    @Override
    public void visit(Koala koala) {
        System.out.println("Request to visit the koala.");
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("Request to visit the monkey.");
    }

    @Override
    public void visit(Lion lion) {
        System.out.println("Request to visit the lion.");
    }
}
