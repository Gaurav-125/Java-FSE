public class Main {
    public static void main(String[] args) {
        TaskLinkedList list = new TaskLinkedList();

        list.addTask(new Task(1,"Design UI","In progress"));
        list.addTask(new Task(2,"Backend design","Pending"));
        list.addTask(new Task(3,"Testing","Pending"));

        System.out.println("All Task");
        list.Traverse();

        Task task=list.searchTask(2);
        System.out.println(task);

        list.deleteTask(1);
    }
}
