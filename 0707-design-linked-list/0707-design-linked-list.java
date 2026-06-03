
 class ListNode{
    int val;
    ListNode next;
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    private ListNode head;
    private int sz;

    public MyLinkedList() {
        head = null;
        sz = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= sz) return -1;
        ListNode cur = head;
        while(index-- > 0){
            cur = cur.next;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val, head);
        head = newNode;
        sz++;
    }
    
    public void addAtTail(int val) {
        if(sz == 0){
            addAtHead(val);
            return;
        }
        ListNode newNode = new ListNode(val);
        ListNode cur = head;
        int jumps = sz-1;
        while(jumps-- > 0){
            cur = cur.next;
        }
        cur.next = newNode;
        sz++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > sz) return;
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == sz){
            addAtTail(val);
            return;
        }
        ListNode cur = head;
        int jumps = index - 1;
        while(jumps-- > 0){
            cur = cur.next;
        }
        cur.next = new ListNode(val, cur.next);
        // ListNode curNext = cur.next;
        // cur.next = new ListNode(val);
        // cur.next.next = curNext;
        sz++;
    }
    
    private void deleteAtHead(){
        head = head.next;
        sz--;
        return;
    }

    private void deleteAtTail(){
        ListNode cur = head;
        int j = sz-2;
        while(j-- > 0){
            cur = cur.next;
        }
        cur.next = null;
        sz--;
        return;
    }

    public void deleteAtIndex(int index) {
        if(sz == 0) return;
        if(index < 0 || index >= sz) return;
        if(index == 0){
            deleteAtHead();
            return;
        }
        if(index == sz-1){
            deleteAtTail();
            return;
        }
        ListNode cur = head;
        int j = index-1;
        while(j-- > 0){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        sz--;
        return;
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */