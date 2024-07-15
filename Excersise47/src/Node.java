
public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    public void next() {
        setNext();
        ListItem next = this.rightLink;
    }

    @Override
    public void setNext() {
        ListItem next = this.rightLink;
        setNext(next);
    }

    public void setNext(ListItem nextItem) {
        nextItem = this.rightLink;
        setNext(nextItem);
    }

    @Override
    public void previous() {
        this.value = this.leftLink;
    }

    @Override
    public void setPrevious() {
        ListItem item = this.leftLink;
    }

    @Override
    public void compareTo() {

    }

}
