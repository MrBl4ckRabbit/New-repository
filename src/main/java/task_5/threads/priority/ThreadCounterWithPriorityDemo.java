package task_5.threads.priority;


import task_5.threads.priority.worker.ThreadCounterWithPriorityWorker;

public class ThreadCounterWithPriorityDemo {
    public static void main(String[] args) {
        ThreadCounterWithPriorityWorker tcw1 = new ThreadCounterWithPriorityWorker("A", 5000, 10);
        ThreadCounterWithPriorityWorker tcw2 = new ThreadCounterWithPriorityWorker("B", 5000, 1);


        // МНОГОПОТОЧНАЯ ОБРАБОТКА
        tcw1.start();
        tcw2.start();

        // НЕ ГАРАНТИРУЕТСЯ ПОРЯДОК
        System.out.println("Process is finished!!!");
    }
}
