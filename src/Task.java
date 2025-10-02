public class Task {

    // добавьте переменную priority с приоритетом задачи
    private String description;
    private TaskPriority priority;

    // добавьте конструктор класса
    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    // добавьте метод get для приоритета
    public TaskPriority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}