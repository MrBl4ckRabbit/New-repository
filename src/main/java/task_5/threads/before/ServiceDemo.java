package task_5.threads.before;

public class ServiceDemo {
    public static void main(String[] args) {
        Service service = new Service();

        service.readData();
        service.showGreetingMessage();
        service.calculateFactorial(20);
        service.calculateSum(100);
        service.finishProgram();
    }
}
