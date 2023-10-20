package main_seminar2;

public interface IQueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
