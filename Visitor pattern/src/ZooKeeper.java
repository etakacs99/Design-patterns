public class ZooKeeper implements Zoo{
    Zoo[] animals;

    public ZooKeeper(){
        animals = new Zoo[] { new Koala(), new Lion(), new Monkey(), new Penguin() };
    }


    @Override
    public void accept(ZooVisitor zooVisitor) {
        for(int i = 0; i < animals.length; i++){
            animals[i].accept(zooVisitor);
        }
        zooVisitor.visit(this);
    }
}
