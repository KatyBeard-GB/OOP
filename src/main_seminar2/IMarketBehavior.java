package main_seminar2;

import java.util.List;

public interface IMarketBehavior {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actorList);
    void update();
}
