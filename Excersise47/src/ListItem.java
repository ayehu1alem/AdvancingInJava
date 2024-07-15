public abstract class ListItem {

    protected Object value;
    protected ListItem leftLink, rightLink;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract void next();
    public abstract void setNext();
    public abstract void previous();
    public abstract void setPrevious();
    public abstract void compareTo();

    private void setValue(Object value){
        this.value = value;
    }

    public Object getValue(){
        return value;
    }

}
