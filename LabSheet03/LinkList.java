public class LinkList {
    private Node head;

    public LinkList() {
        this.head = null;
    }

    public String traversel() {
        Node current_node = head;
        String result = "[";
        boolean first_node = true;
        while (current_node != null) {
            result += (!first_node ? ", " : "") + current_node.data;
            current_node = current_node.next;
            first_node = false;
        }
        result += "]";
        return result;
    }

    public void insert(int position, Object value){
        Node new_node = new Node(value);
        if (head == null) {
            head = new_node;
        } else if (position == 0) {
            new_node.next = head;
            head = new_node;
        } else {
            Node current_node = head;
            int current_position = 0;
            while (current_node != null && current_position < position - 1) {
                current_node = current_node.next;
                current_position++;
            }
            new_node.next = current_node.next;
            current_node.next = new_node;
        }
    }
    public void insert(Object value) {
        Node new_node = new Node(value);
        if (head == null) {
            head = new_node;
        } else {
            Node current_node = head;
            while (current_node.next != null) {
                current_node = current_node.next;
            }
            current_node.next = new_node;
        }
    }

    public void remove(int position) {
        if (position == 0) {
            Node current_node = head;
            head = current_node.next;
        } else {
            Node current_node = head;
            int current_position = 0;
            while (current_node.next != null && current_position < position - 1) {
                current_node = current_node.next;
                current_position++;
            }
            current_node.next = current_node.next.next;
        }
    }

    public void removeLastElement() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node current_node = head;
                while (current_node.next.next != null) {
                    current_node = current_node.next.next;
                }
                current_node.next = null;
            }
        }
    }

    public int length() {
        int length = 0;
        Node current_node = head;
        while (current_node != null) {
            length += 1;
            current_node = current_node.next;
        }
        return length;
    }

    public Object get(int position) {
        Node current_node = head;
        int current_index = 0;
        Object data = null;
        while (current_node != null) {
            if (current_index == position) {
                data = current_node.data;
                break;
            } else {
                current_index += 1;
                current_node = current_node.next;
            }
        }
        return data;
    }

    public void set(int position, Object value) {
        Node current_node = head;
        int current_index = 0;
        while (current_node != null) {
            if (current_index == position) {
                current_node.data = value;
                break;
            } else {
                current_index += 1;
                current_node = current_node.next;
            }
        }
    }

    public void clear() {
        head = null;
    }
}
