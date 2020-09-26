package Example;

public class SingleLinkList {
    Node head = null;
    public void create(int data){
        Node node = new Node(data);
        this.head = node;
    }

    /**
     * 获得链表长度
     * @return
     */
    public int getLength(){
        Node cur = head;
        int len = 0;
        while(cur!=null){
            len++;
            cur = cur.nextNode;
        }
        return len;
    }

    /**
     * 遍历链表
     */
    public void travel(){
        Node cur = head;
        while(cur !=null){
            System.out.print(cur.data+"\t");
            cur = cur.nextNode;
        }
    }

    /**
     * 头插
     */
    public void add(int data){
        if(this.head!=null){//链表已经创建后的情况
            Node node = new Node(data);
            node.nextNode = this.head;
            this.head = node;
        }
    }

    /**
     * 尾插
     * @param data
     */
    public void append(int data) {
        if(this.head  != null){//已经创建了链表的情况
            Node node = new Node(data);
            Node cur = this.head;
            while (cur.nextNode != null) {
                cur = cur.nextNode;
            }
            cur.nextNode = node;
        }
    }

    /**
     * 删除结点
     * @param data
     */
    public void del(int data){
        Node cur = this.head;
        int len = getLength();
        int i;
        for (i = 0; i < len; i++) {
            if(cur.nextNode.data == data) {
                cur.nextNode = cur.nextNode.nextNode;
                System.out.println("删除成功!");
                break;
            }else{
                cur = cur.nextNode;
            }
        }

        if(i>=len){
            System.out.println("删除失败,未找到相应结点!");
        }
    }

    /**
     * 查找数据
     * @param data
     */
    public void search(int data){
        Node cur = this.head;
        int len = getLength();
        int i=0;
        for (i=0;i<len;i++){
            if(cur.data == data){
                System.out.println("找到了!!! index = "+i);
                break;
            }else{
                cur = cur.nextNode;
            }
        }
        if(i>=len){
            System.out.println("未找到相应结点.");
        }
    }
}


