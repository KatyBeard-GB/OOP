package main_seminar2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Market implements IMarketBehavior, IQueueBehaviour{
    private final List<Actor> queue;
    private Random random = new Random();

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor :
                actorList) {
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        queue.add(actor);
        getQueue();
    }

    @Override
    public void takeOrders() {
        for (Actor actor :
                queue) {
            if (!actor.isMakeOrder) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor :
                queue) {
            if (actor.isMakeOrder) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> actorListRelease = new ArrayList<>();
        List<Actor> actorListTakeOrder = new ArrayList<>();

        for (Actor actor :
                queue) {
            boolean status = random.nextBoolean();
            if (actor.isTakeOrder() && status) {
                actorListRelease.add(actor);
                System.out.println(actor.getName()
                        + " готов выходить");
            } else if (actor.isTakeOrder() && !status) {
                actorListTakeOrder.add(actor);
                System.out.println(actor.getName()
                        + " готов сделать ещё один заказ");
            }
        }
        releaseFromMarket(actorListRelease);
        for (Actor actor :
                actorListTakeOrder) {
            queue.remove(actor);
            actor.setMakeOrder(false);
            actor.setTakeOrder(false);
            System.out.println(actor.getName() + " пошел вставать в очередь");
            takeInQueue(actor);
        }
    }

    public void getQueue(){
        List<String> result = new ArrayList<>();
        for (Actor actor :
                queue) {
            result.add(actor.getName());
        }
        System.out.println("Очередь: " + result.toString());
    }
}
