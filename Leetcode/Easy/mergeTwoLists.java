class Solution {
    public ListNode mergeTwoLists(ListNode head, ListNode tail) {
        ListNode fh=null , ft=null;
        if( head == null) return tail;
        if( tail == null) return head;

        while( head!=null && tail!=null){
             if(fh== null && ft==null){
                if( head.val > tail.val){
                    fh = tail;
                    ft = tail;
                    tail=tail.next;
                }
                else{
                    fh=head;
                    ft=head;
                    head=head.next;
             }
        }
        else {
                
            if( head.val < tail.val){
                ft.next=head;
                ft=ft.next;
                head=head.next;

            }else{
                ft.next=tail;
                ft=ft.next;
                tail=tail.next;
            }
            }

        }
        if(head!=null){
            ft.next=head;
        }
        if(tail!=null){
            ft.next=tail;
        }

        return fh;
        

        }

}
