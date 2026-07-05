public class TaskLinkedList {
    private Task head;

    public void addTask(Task task){
        if(head==null){
            head=task;
            return;
        }

        Task current=head;

        while (current.next!=null) {
            current=current.next;
        }

        current.next=task;
    }

    public Task searchTask(int taskId){
        Task current=head;

        while (current.next!=null) {
            int id=current.getTaskId();
            if(id==taskId) return current;

            current=current.next;
        }
        return null;
    }

    public void Traverse(){
        Task current = head;
        while (current!=null) {
            System.out.println(current);
            current=current.next;
        }
    }

    public void deleteTask(int taskId){
        if(head==null) return;

        if(head.getTaskId()==taskId){
            head=head.next;
            System.out.println("Task deleted!!");
            return;
        }

        Task current=head;

        while(current.next!=null && current.next.getTaskId()!=taskId){
            current = current.next;
        }

        if(current.next!=null){
            current.next=current.next.next;
            System.out.println("Task deleted!!");
        }else{
            System.out.println("Task Not Found");
        }
    }
}
